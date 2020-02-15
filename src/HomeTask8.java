import java.util.Scanner;

public class HomeTask8 {
    public static void main(String[] args) {
        Validator validator = new Validator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input count of all books in the shelf:");
        int countOfBooksInTheShelf = scanner.nextInt();
        validator.validateCountOfBooks(countOfBooksInTheShelf);
        Books booksInTheShelf = new Books(countOfBooksInTheShelf);
        for(int i  = 0; i<countOfBooksInTheShelf; i++){
            booksInTheShelf.add(Book.inputBook(i));
        }
        System.out.println("That's all the books you've just added:");
        booksInTheShelf.view();
        System.out.println("Input percent to increase books cost ");
        int percent = scanner.nextInt();
        booksInTheShelf.changeCost(percent);
        System.out.println("That's costs of all the books you've just added after recent cost changing:");
        booksInTheShelf.view();
        System.out.println("Input full name of the author which books you wanna find");
        String author = scanner.next();
        booksInTheShelf.findByAuthor(author).view();
        System.out.println("Input year from which books you wanna find");
        int year = scanner.nextInt();
        booksInTheShelf.foundFromYearOfPublication(year).view();

        System.out.println("Sorted by Author:");
        booksInTheShelf.getSortedBooks(new BookAuthorComparator()).view();

        System.out.println("Sorted by Publisher:");
        booksInTheShelf.getSortedBooks(new BookPublisherComparator()).view();

        System.out.println("Sorted by Cost:");
        booksInTheShelf.getSortedBooks(new BookPriceComparator()).view();
    }

}
