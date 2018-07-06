package pl.javastart.mp3player.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.farng.mp3.MP3File;
import org.farng.mp3.TagException;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import pl.javastart.mp3player.mp3.Mp3Collection;
import pl.javastart.mp3player.mp3.Mp3Song;

public class ContentPaneController implements Initializable {

	public static final String TITLE_COLUMN = "Tytuł";
	public static final String AUTHOR_COLUMN = "Autor";
	public static final String ALBUM_COLUMN = "Album";
	private Mp3Collection mp3collection; // zmienna klasy o mp3Collection reprezentująca listę piosenek

	@FXML
	private TableView<Mp3Song> contentTable;
	
	public TableView<Mp3Song> getContentTable() {
		return contentTable;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		configureTable();
		configureTestMp3();
	}

	private void configureTable() {
		TableColumn<Mp3Song, String> titleColumn = new TableColumn<Mp3Song, String>(TITLE_COLUMN);
		titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));

		TableColumn<Mp3Song, String> authorColumn = new TableColumn<Mp3Song, String>(AUTHOR_COLUMN);
		authorColumn.setCellValueFactory(new PropertyValueFactory<>("author"));

		TableColumn<Mp3Song, String> albumColumn = new TableColumn<Mp3Song, String>(ALBUM_COLUMN);
		albumColumn.setCellValueFactory(new PropertyValueFactory<>("album"));

		contentTable.getColumns().add(titleColumn);
		contentTable.getColumns().add(authorColumn);
		contentTable.getColumns().add(albumColumn);
	}

	private void configureTestMp3() {							//wczytanie informacji o naszym 1 pliku i dodanie ich do listy.
		mp3collection = new Mp3Collection();
		contentTable.setItems(mp3collection.getSongList());

		Mp3Song mp3song = createMp3SongFromPath("test.mp3");		//tworzymy jeden obiekt typu Mp3Song i dodajemy go do listy
		mp3collection.addSong(mp3song);
	}

	private Mp3Song createMp3SongFromPath(String filePath) {		// zadaniem tej mwtody jest utworzenie i zwrócenie obiektu typu Mp3Song na podstawie pliku
		File file = new File(filePath);								//Jako argument metody przekazaliśmy samą nazwę pliku "test.mp3". tworząc obiekt za pomocą new File(filePath)
		Mp3Song result = new Mp3Song();								//tworzymy pusty obiekt Mp3Song, który w konstruktorze inicjuje obiekty typu StringProperty
		try {
			MP3File mp3File = new MP3File(file);					// tworzymy obiekt Mp3File, który pozwala na odczytanie informacji specyficznych dla plików zakodowanych w formacie mp3
			result.setFilePath(file.getAbsolutePath());				//tytuł, autor, czy album zakodowane są w kontenerze ID3 pliku, musimy się do nich odwoływać poprzez obiekt go reprezentujący,  
			result.setTitle(mp3File.getID3v2Tag().getSongTitle());	//a jest on zwracany przez metodę mp3File.getID3v2Tag().
			result.setAuthor(mp3File.getID3v2Tag().getLeadArtist());
			result.setAlbum(mp3File.getID3v2Tag().getAlbumTitle());
		} catch (IOException | TagException e) {
			e.printStackTrace();
		}
		return result;
	}

}