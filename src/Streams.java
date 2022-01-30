import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {

        System.out.println(Book.getBook().stream()
                .map(Book::toString)
                .sorted()
                .collect(Collectors.joining(", ")));
    }
}
