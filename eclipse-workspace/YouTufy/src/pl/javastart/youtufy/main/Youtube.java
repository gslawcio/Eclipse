package pl.javastart.youtufy.main;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pl.javastart.youtufy.data.YoutubeVideo;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Youtube {
	/*
	 * Dla większej czytelności kodu Stringi odpowiedzialne za określenie poszczególnych węzłów umieściliśmy w stałych prywatnych. 
	 * Jeżeli zastanawiasz się skąd się wziął np. ten napis div.yt-lockup-content - otóż wystarczy chwilę popatrzeć w źródło strony wyniku wyszukiwania strony
	 * youtube (ctrl + u w przeglądarce) i zauważysz, że są tam elementy <div>, w których są inne elementy <div> lub <a>. 
	 * Jeżeli dany <div> ma dodaną klasę css np. w postaci <div class="yt-lockup-content" ...>text lub inne elementy</div> 
	 * to możesz za pomocą metody select() wyciągnąć informacje o takim węźle odwołując się właśnie poprzez typ elementu i jego klasę CSS po operatorze kropki - div.yt-lockup-content.
	 *
	 * Z listy kolekcji takich obiektów (videosNodes) możesz wyciągnąć obiekty bardziej szczegółowe - 
	 * czyli link przechowujący tytuł i adres URL filmu (a.yt-uix-tile-link.yt-ui-ellipsis.yt-ui-ellipsis-2.yt-uix-sessionlink.spf-link), 
	 * a także link prowadzący do profilu autora filmu (a.yt-uix-sessionlink.spf-link.g-hovercard).
	 */
	private final String YOUTUBE_SEARCH_URL =  "http://www.youtube.com/results";
	private final String SEARCH_PARAMETER = "search_query";
	private final String VIDEO_NODES = "div.yt-lockup-content";
	private final String VIDEO_TITLE_URL = "a.yt-uix-tile-link.yt-ui-ellipsis.yt-ui-ellipsis-2.yt-uix-sessionlink.spf-link ";
	private final String VIDEO_AUTHOR = "a.yt-uix-sessionlink.spf-link.g-hovercard";
	
/*
 * Klasa komunikująca się z YouTube
 * Musi ona przechowywać przede wszystkim listę filmów w postaci obiektów YoutubeVideo, które będę wyciągnięte ze strony wyników wyszukiwania
 * wykorzystujemy kolekcję typu ObservableList
 * do takiej listy zostaną dodane nowe obiekty (lub usunięte) to nasza tabela automatycznie zaktualizuje widok. 
 * Przyda się także jedna właściwość typu StringProperty do przechowywania wyszukiwanej przez użytkownika frazy, którą zbindujemy z właściwością w polu wyszukiwania (TextField)
 * kolekcje typu Observable nie posiadają konstruktorów. W celu ich utworzenia należy wykorzystać klasę FXCollections i jej statyczne metody
 */
	
	private ObservableList<YoutubeVideo> youtubeVideos;
	private StringProperty searchQery;
	
	public ObservableList<YoutubeVideo> getYoutubeVideos(){
		return youtubeVideos;
	}
	public void setYoutubeVideos(ObservableList<YoutubeVideo> youtubeVideos) {
		this.youtubeVideos=youtubeVideos;
	}
	
	public StringProperty getSearchQuery()
	{
		return searchQery;
	}
	public void setSearchQuery(StringProperty searchQuery) {
		this.searchQery = searchQuery;
	}
	
	public Youtube() {
		youtubeVideos = FXCollections.observableArrayList();
		searchQery = new SimpleStringProperty();
	}
	
	/*
	 * w klasie tej przyda się nam też sama metoda wyszukiwania
	 *  Użytkownikowi naszej klasy udostępniamy tylko jedną publiczną metodę search(), 
	 *  której zadaniem jest wywołanie prywatnej metody search(String query) 
	 *  - gdzie query to wyszukiwane hasło. Metoda ta wywołuje w pierwszej kolejności prywatną metodę getPageSource(String query),
	 */
	
	public void search() throws IOException	// publiczna metoda search udostępniona użytkownikowi
	{
		try {
		search(searchQery.get());
		} catch(IOException e)
				{
				throw e;
				}
		}
		private void search(String query) throws IOException {   //prywatna metoda search
			// pobieramy źródło strony
			String pageContent = getPageSource(query);

			// wyciągamy informacje o filmach
			Document doc = Jsoup.parse(pageContent);		//tworzymy obiekt Document za pomocą statycznej metody Jsoup.parse(),
															//której jako argument przekazujemy pobrane przed chwilą źródło strony. Następnie wyciągamy węzły reprezentujące wyniki na liście wyszukiwania.
			Elements videosNodes = doc.select(VIDEO_NODES);

			List<YoutubeVideo> videos = new ArrayList<>();
			for (Element e : videosNodes) {
				Element titleUrlElement = e.select(VIDEO_TITLE_URL).first();
				Element authorElement = e.select(VIDEO_AUTHOR).first();
			//W pętli wyciągamy adres url korzystając z metody attr("href"). Robimy to dlatego, że linki w kodzie html mają postać <a href="adres_url">tekst odnośnika</a>,
			//	czyli na przykład <a href="adres_do_profilu_autora">nazwa autora</a>.
				
				String url = titleUrlElement.attr("href").replace("/watch?v=", "");
			//Będą one jednak będzie postaci /watch?v=PotrzebneNamId, a ponieważ chcemy samo ID filmu, to korzystamy z metody replace() klasy String. 
			//String reprezentujący tytuł filmu i autora to zwykły tekst, więc wyciągamy go za pomocą metody text(). 
				String title = titleUrlElement.text();
				String author = authorElement.text();
			/*  Elementy te niestety także pojawiają się na liście wyników wyszukiwania youtube. Jeżeli rozpoznamy, że dany element jest jednego z powyższych typów 
			*	to przechodzimy do kolejnej iteracji wywołując instrukcję continue. 
			*	W dalszej części tworzymy obiekt typu YoutubeVideo, ustawiamy jego odpowiednie pola i dodajemy go do listy videos.
			*/	
				if (url.contains("list") || url.contains("channel") || url.contains("user")) {
					continue;
				} else {
					YoutubeVideo yv = new YoutubeVideo();
					yv.setId(url);
					yv.setTitle(title);
					yv.setAuthor(author);
					videos.add(yv);
				}
			}

			// usuwamy wszystkie obiekty z Observable List i dodajemy nowe wyniki
			// wyszukiwania
			youtubeVideos.clear();
			youtubeVideos.addAll(videos);
		}

		private String getPageSource(String query) throws IOException {
			/* Tworzymy adres URL zapytania
			 * klasa URL dająca kilka dodatkowych możliwości. URI budujemy wykorzystując klasę URIBuilder z pakietu HTTP Client. 
			 * Działa ona w ten sposób, że w konstruktorze podajemy podstawowy URL, 
			 * który chcemy zbudować (u nas jest to stałą reprezentująca String "http://www.youtube.com/results"), 
			 * a poprzez wywołanie na takim obiekcie metody addParameter() możemy dodać parametr GET (czyli to co jest po znaku "?"):
			 * 
			 * URI jest obiekt klasy URL
			*/
			URI searchUri = null;
			try {
				searchUri = new URIBuilder(YOUTUBE_SEARCH_URL).addParameter(SEARCH_PARAMETER, query).build();	//Dzięki klasie URIBuilder nie musimy się martwić o zamianę spacji na + itp., 
																												//a po wywołaniu na niej metody build() uzyskujemy obiekt typu URI.
			} catch (URISyntaxException e) {
				System.err.println("Błąd przy budowaniu adresu URL");
			}

			// tworzymy obiekty do wysłania żądania i odebrania odpowiedzi od
			// serwera
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpGet request = new HttpGet(searchUri);
			CloseableHttpResponse response = null;
			HttpEntity httpEntity = null;
			String pageContent = null;

			// pobieramy treść strony WWW
			try {
				response = httpClient.execute(request);		//wysyła żądanie do serwera youtube, które w odpowiedzi zwraca odpowiedź, która zostaje przypisana do zmiennej "response" typu CloseableHttpResponse. 
				httpEntity = response.getEntity();			//Obiekt typu HTTPEntity reprezentuje zawartość strony internetowej 
															//i to właśnie z niego wyciągamy za pomocą metody EntityUtils.toString(httpEntity) źródło strony, które na końcu zwracamy za pomocą return pageContent.
						//  http://hc.apache.org/httpcomponents-client-ga/tutorial/html/fundamentals.html
				pageContent = EntityUtils.toString(httpEntity);  
			} catch (ClientProtocolException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				response.close();
				httpClient.close();
			}

			// zwracamy źródło strony
			return pageContent;
		}
	
}
