package pl.javastart.youtufy.data;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class YoutubeVideo {
/*
 * dane przechowywane będą w obiektach StringProperty, dla których utworzony jest getter i setter pozwalający odczytać wartości w postaci Stringów,
 *  ale także specjalny getter zwracający wartość obiektu StringProperty, w którym dodatkowo zastosowane jest zabezpieczenie przed zwracaniem wartości typu null.
 */
	private StringProperty id;
	private StringProperty title;
	private StringProperty author;
	
	public YoutubeVideo() {
		id = new SimpleStringProperty();
		title = new SimpleStringProperty();
		author = new SimpleStringProperty();
	}
	public String getId() {
		return id.get();
	}

	public void setId(String id) {
		this.id.setValue(id);
	}
	public StringProperty idProperty() {
		if(id == null) id = new SimpleStringProperty(this, "id");
		return id;
	}
	public String getTitle() {
		return title.get();
	}
	
	public void setTitle(String title) {
		this.title.setValue(title);
	}
	
	public StringProperty TitleProperty() {
		if(title ==null) title = new SimpleStringProperty(this,"title");
		return title;
	}
	public String getAuthor() {
		return author.get();
	}
	public void setAuthor(String author) {
		this.author.setValue(author);
	}
	public StringProperty AuthorProperty() {
		if (author == null) author = new SimpleStringProperty(this,"author");
		return author;
	}
	@Override
	public String toString() {
		return "YoutubeVideo [id=" + id + ", title=" + title + ", author=" + author + "]";
	}
	
}
