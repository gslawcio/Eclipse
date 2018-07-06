package data;
 
public class Library {
     
    public static final int MAX_BOOKS = 1000;
    public static final int MAX_MAGAZINES = 1000;
    private Book[] books;
    private int booksNumber;
    private Magazine[] magazines;
    private int magazinesNumber;
     
    public Library() {
        books = new Book[MAX_BOOKS];
        magazines = new Magazine[MAX_MAGAZINES];
    }
 
    public void addBook(Book book) {
        if(booksNumber < MAX_BOOKS) {
            books[booksNumber] = book;
            booksNumber++;
        } else {
            System.out.println("Maxymalna liczba ksi��ek zosta�a osi�gni�ta");
        }
         
    }
     
    public void addMagazine(Magazine magazine) {
        if(magazinesNumber < MAX_MAGAZINES) {
            magazines[magazinesNumber] = magazine;
            magazinesNumber++;
        } else {
            System.out.println("Maxymalna liczba magazyn�w zosta�a osi�gni�ta");
        }
         
    }
     
    public Book[] getBooks() {
        return books;
    }
 
    public int getBooksNumber() {
        return booksNumber;
    }
     
    public Magazine[] getMagazines() {
        return magazines;
    }
     
    public int getMagazinesNumber() {
        return magazinesNumber;
    }
     
    public void printBooks() {
        if(booksNumber == 0) {
            System.out.println("Brak ksi��ek w bibliotece");
        }
        for(int i=0; i<booksNumber; i++) {
            books[i].printInfo();
        }
    }
     
    public void printMagazines() {
        if(magazinesNumber == 0) {
            System.out.println("Brak magazyn�w w bibliotece");
        }
        for(int i=0; i<magazinesNumber; i++) {
            magazines[i].printInfo();
        }
    }
}