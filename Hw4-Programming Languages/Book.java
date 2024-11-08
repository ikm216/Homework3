/**
 * Abstract class of a Book in the library.
 * Provides title, author, isbn, and checked out for different types of books.
 */

public abstract class Book{
    protected String title;
    protected String author;
    protected String isbn;
    protected boolean is_checked_out;

    /**
     * Constructs a new Book with the title, author, and isbn.
     * @param title The title of the book.
     * @param author The author of the book.
     * @param ISBN The ISBN of the book.
     */

    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        is_checked_out = false;
    }

    /**
     * Checks the book out by setting the status to true.
     */

    public void check_out(){
        this.is_checked_out = true;
    }

     /**
     * Returns the book by setting the status to false.
     */

    public void return_book(){
        this.is_checked_out = false;
    }

     /**
     * Abstract method that describes the book.
     * @return A string describing the book.
     */

    public abstract String describe();
}

/**
 * A class extending the Book class for Fiction books
 */
class Fiction extends Book{
    public Fiction(String title, String author, String isbn){
        super(title, author, isbn);
    }

    public String describe(){
        return "Fiction " + title + author;
    }
}
/**
 * A class extending the Book class for NonFiction books
 */
class NonFiction extends Book{
    public NonFiction(String title, String author, String isbn){
        super(title, author, isbn);
    }

    public String describe(){
        return "NonFiction " + title + author;
    }
}