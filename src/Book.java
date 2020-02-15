import java.util.Scanner;

public class Book {

    //(ID, Title, Author,Publisher, Year of publication, Number of pages, Cost)
    private final String id;
    private final String title;
    private final String author;
    private final String publisher;
    private final int yearOfPublication;
    private final int numberOfPages;
    private double cost;
    private final static Validator validator = new Validator();

    public Book(String id, String title, String author, String publisher, int yearOfPublication, int numberOfPages,
                double cost) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Book{" +
                "\n id='" + id + '\'' +
                ",\n title='" + title + '\'' +
                ",\n author='" + author + '\'' +
                ",\n publisher='" + publisher + '\'' +
                ",\n yearOfPublication=" + yearOfPublication +
                ",\n numberOfPages=" + numberOfPages +
                ",\n cost=" + cost +
                '}';
    }

    public static Book inputBook(int bookIndex) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input id for book#"+(bookIndex+1));
            String id = scanner.next();
            validator.validateId(id);
            System.out.println("Input title of book#"+(bookIndex+1));
            String title = scanner.next();
            System.out.println("Input author of book#"+(bookIndex+1));
            String author = scanner.next();
            System.out.println("Input publisher of book#"+(bookIndex+1));
            String publisher = scanner.next();
            System.out.println("Input year of publishing of book#"+(bookIndex+1));
            int year = scanner.nextInt();
            System.out.println("Input number of pages of book#"+(bookIndex+1));
            int numberOfPages = scanner.nextInt();
            validator.validateCountOfPages(numberOfPages);
            System.out.println("Input cost of book#"+(bookIndex+1));
            double cost = scanner.nextDouble();
            return new Book(id,title,author,publisher,year,numberOfPages,cost);
    }
}

