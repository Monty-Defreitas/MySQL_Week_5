import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalDealings {


    public static void main(String[] args) {
        whatTheHeckIsThing();
    }


    private static void whatTheHeckIsThing(){
        Book book = getDealings(Optional.of(new Book("Star Wars")));
        System.out.println(book);

        try {
            getDealings(Optional.empty());
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
  private static Book getDealings(Optional<Book> bookRequest) {
        return (bookRequest)
                .orElseThrow(() -> new NoSuchElementException( "The requested book does not exist"));
    }

}
