package data;

public class Book {
	private String author;
	private String isbn;
	private int pages;
	private String publisher;
	private int releaseDate;
	private String title;

	public Book(String title, String author, int releaseDate, int pages, String publisher, String isbn) {
		this.setTitle(title);
		this.setAuthor(author);
		this.setReleaseDate(releaseDate);
		this.setPages(pages);
		this.setPublisher(publisher);
		this.setIsbn(isbn);
	}
/*
	public Book(Book book) {
		this(book.getTitle(), book.getAuthor(), book.getReleaseDate(), book.getPages(), book.getPublisher(), book.getIsbn());
	}*/

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	public int getPages() {
		return pages;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	public String getTitle() {
		return title;
	}

	public void printInfo() {
		String info = getTitle() + "; " + getAuthor() + "; " + getReleaseDate() + "; " + getPages() + "; " + getPublisher()
				+ "; " + getIsbn();
		System.out.println(info);
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}