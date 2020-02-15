import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        if (book1.getCost() == book2.getCost()) {
            return 0;
        } else if (book1.getCost() > book2.getCost()) {
            return -1;
        } else {
            return 1;
        }

    }
}
