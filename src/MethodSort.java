import java.util.Comparator;
import java.util.List;


public class MethodSort {

    public static void main(String[] args) {
        sortBooksWithLambda();
        sortBooksWithMethodReference();
    }

    public static void sortBooksWithLambda() {
        List<Book> bookList = Book.getBook();
        bookList.sort((b1, b2) -> Book.compare(b1,b2));
        System.out.println(bookList + " Used Lambda Sort");

    }

    public static void sortBooksWithMethodReference(){
        List<Book> bookList = Book.getBook();
        bookList.sort(Book::compare);
        System.out.println(bookList + " Used Method Sort");
    }
}
