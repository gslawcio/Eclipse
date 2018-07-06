package pl.javastart.youtufy.controller;

import java.net.URL;
import java.util.ResourceBundle;


import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import pl.javastart.youtufy.data.YoutubePlayer;
import pl.javastart.youtufy.data.YoutubeVideo;
/*
 *  konfigurujemy naszą tabelę i dodajemy do niej odpowiednio skonfigurowane kolumny.
 */
public class ContentPaneController implements Initializable {	

    @FXML
    private TableView<YoutubeVideo> resultTableView;

    @FXML
    private WebView videoWebView;
    
    public WebView getVideoWebView() {
		return videoWebView;
	}
	public TableView<YoutubeVideo> getResultTableView(){
    	return resultTableView;
    }
    public void setResultTableView(TableView<YoutubeVideo> resultTableView) {
    	this.resultTableView = resultTableView;
    }
    
    public WebView getVideoWiev() {
    	return videoWebView;
    }
    public void setVideoWebView(WebView videoWebView) {
    	this.videoWebView = videoWebView;
    }
    
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		/*
		 * Obiekty, jakie reprezentują poszczególne kolumny tabeli są typu TableColumn. Powinna ona być sparametryzowana dwoma typami - klasą obiektów, 
		 * z których pobierane będą dane oraz wyświetlaną wartością. W konstruktorze przekazujemy tytuł kolumny, czyli Song albo Youtube Author. 
		 * W naszej aplikacji do reprezentacji danych służy klasa YoutubeVideo przechowująca wartości w postaci obiektów StringProperty, a chcemy wyświetlać tytuł lub autora filmu 
		 * - czyli wartości typu String. Z dokumentacji można się dowiedzieć, że w celu wyświetlania wartości najlepiej jest się posłużyć metodą setCellValueFactory(), 
		 * która powiąże właściwości obiektu z komórką danej kolumny. Zwróć uwagę, 
		 * że w konstruktorze klasy PropertyValueFactory ważne jest odpowiednie odwołanie się do nazwy właściwości z klasy YoutubeVideo ("title" lub "author").
		 */
		TableColumn<YoutubeVideo,String> titleColumn = new TableColumn<>("Song");
		titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
		
		TableColumn<YoutubeVideo, String> authorColumn = new TableColumn<>("Youtube Author");
		authorColumn.setCellValueFactory(new PropertyValueFactory<>("author"));
		
		
		resultTableView.getColumns().add(authorColumn);
		resultTableView.getColumns().add(titleColumn);
		configureWebView();
	}
	
	private void configureWebView() {
		WebEngine webEngine = videoWebView.getEngine();
		webEngine.setJavaScriptEnabled(true);
		webEngine.load(getClass().getResource("/pl/javastart/youtufy/res/video.html").toExternalForm());
	}
	protected void playSelectedItem() {
		WebEngine webEngine = videoWebView.getEngine();
		webEngine.executeScript("player.stopVideo();");
		YoutubeVideo selectedVideo = resultTableView.getSelectionModel().getSelectedItem();
		webEngine.executeScript("player.loadVideoById(\"" + selectedVideo.getId() + "\");");
	}
	protected void progressUpdate() {
		Task<Void> progressTask = new Task<Void>() {
			@Override
			protected Void call() throws Exception {
				while(!isCancelled()) {
					if(playButton.isSelected() && YoutubePlayer.PLAYING.get()) {
						Platform.runLater(() -> songSlider.setValue(songSlider.getValue()+0.1));
					}
					Thread.sleep(100);
				}
				return null;
			}
		};
		Thread t = new Thread(progressTask);
		t.setDaemon(true);
		t.start();
	}
}