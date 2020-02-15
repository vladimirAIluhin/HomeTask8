public class Validator {
    private final static int MAX_COUNT_OF_BOOKS_IN_SHELF = 5;
    private final static int COUNT_COUNT_OF_SYMBOLS_IN_ID = 1;

    public void validateCountOfBooks(int countOfBooks) {
        if (countOfBooks <= 0 || countOfBooks > MAX_COUNT_OF_BOOKS_IN_SHELF) {
            throw new IllegalArgumentException("There are place only for " + MAX_COUNT_OF_BOOKS_IN_SHELF + " books in the shelf." +
                    "\nAnd also keep it in mind that count of books should not be less than zero or equal to zero.");
        }
    }

    public void validateCountOfPages(int countOfPages) {
        if (countOfPages <= 0) {
            throw new IllegalArgumentException("Keep it in mind that count of pages should not be less than zero or equal to zero.");
        }
    }
    public void validateId(String id){
        if(id.length()!=COUNT_COUNT_OF_SYMBOLS_IN_ID){
            throw new IllegalArgumentException("Keep it in mind that we use only "+ COUNT_COUNT_OF_SYMBOLS_IN_ID  +
                    " symbol for ID");
        }
    }
}
