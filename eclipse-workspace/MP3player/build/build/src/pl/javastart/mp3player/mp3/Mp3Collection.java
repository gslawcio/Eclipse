package pl.javastart.mp3player.mp3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Mp3Collection {

	private ObservableList<Mp3Song> songList;		//typ kolekcji  javy FX po wprowadzeniu w nich jakichkolwiek zmian (np. dodanie, czy usunięcie obiektu) 
													//mogą powiadomić obiekt, który z nich korzysta, a ten automatycznie się odświeży

	public ObservableList<Mp3Song> getSongList() {
		return songList;
	}
	
	public void addSong(Mp3Song song) {
		songList.add(song);
	}
	
	public void addSongs(ObservableList<Mp3Song> mp3Songs) {
		songList.addAll(mp3Songs);							// metoda addAll() klasy ObservableList, dodaje wszystkie elementy z kolekcji przekazanej jako argument
	}
	
	public void clear() {
		songList.clear();
	}
	//Kolekcje z JavyFX nie posiadają konstruktorów, można je utworzyć za pomocą statycznych metod klasy FXCollections - w tym przypadku jest to metoda observableArrayList().
	//Raz utworzona lista nie będzie zmieniana podczas, gdy aplikacja będzie uruchomiona
	
	public Mp3Collection() {											//kolekcje z javy FX nie posadają konstruktorów 
		this.songList = FXCollections.observableArrayList();			//tworzymy je za pomocą statycznych metod klasy FXCollections 
	}
}
