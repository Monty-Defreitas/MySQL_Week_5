import java.util.ArrayList;

import java.util.List;

public class Book {

    private String book;

    public static List<Book> books = new ArrayList<Book>(List.of(
            new Book("House of Shadows"), new Book("Ashley Bell"),
            new Book("Silent Corner"), new Book("Innocence"),
            new Book("Silence In The Shadows")));

    public Book(String book) {
        this.book = book;
    }

    public static List<Book> getBook(){
        return new ArrayList<>(books);
    }

    public void setBook(String book) {
        this.book = book;
    }

    public static int compare(Book b1, Book b2) {
        return b1.book.compareTo(b2.book);
    }

    @Override
    public String toString() {
        return book + " " + "Book " ;
    }

}
