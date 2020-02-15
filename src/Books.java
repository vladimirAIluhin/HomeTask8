import java.util.Arrays;
import java.util.Comparator;

public class Books {
    private final Book[] books;
    private int countOfBooks;

    public Books(int maxNumberOfBooks) {
        this.books = new Book[maxNumberOfBooks];
        this.countOfBooks = 0;
    }

    public void add(Book book) {
        books[countOfBooks++] = book;
    }

    public void view() {
        for (int i = 0; i < countOfBooks; i++) {
            System.out.println(books[i]);
        }
    }

    public void changeCost(double percent) {
        for (int i = 0; i < countOfBooks; i++) {
            books[i].setCost(books[i].getCost() * (100 + percent) / 100);
        }
    }

    public Books findByAuthor(String author) {
        Books foundBooks = new Books(this.books.length);
        for (int i = 0; i < countOfBooks; i++) {
            if (books[i].getAuthor().equals(author)) {
                foundBooks.add(books[i]);
            }
        }
        return foundBooks;
    }

    public Books getSortedBooks(Comparator<Book> howToSort) {
        Book[] sortedBooksArray = Arrays.copyOf(books, countOfBooks);
        Arrays.sort(sortedBooksArray, howToSort);
        Books sortedBooks = new Books(countOfBooks);
        for (int i = 0; i < countOfBooks; i++) {
            sortedBooks.add(sortedBooksArray[i]);
        }
        return sortedBooks;
    }

    public Books foundFromYearOfPublication(int yearOfPublication) {
        Books foundBooks = new Books(this.books.length);
        for (int i = 0; i < countOfBooks; i++) {
            if (books[i].getYearOfPublication() >= yearOfPublication) {
                foundBooks.add(books[i]);
            }
        }
        return foundBooks;
    }

}
