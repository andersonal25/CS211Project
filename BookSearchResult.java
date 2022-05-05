import java.util.List;

/**
 * BookSearchResult class
 * encapsulates the user's results from the book search to include the libraries where the book can be found
 */
public class BookSearchResult extends Result{
    private Book book;
    private List<Library>libraries;

    /**
     * BookSearchResult() constructor
     * sets/initializes class member variables 
     * @param book
     * @param libraries
     */
    public BookSearchResult(Book book, List<Library> libraries){
        setBook(book);
        setLibraries(libraries);
    }

    /**
     * setBook() method
     * a setter method for Book
     */
    public void setBook(Book book){
        this.book = book;
    }

    /**
     * getBook() method
     * a getter method for Book
     * @return
     */
    public Book getBook(){
        return this.book;
    }

    /**
     * setLibaries() method
     * a setter method for libraries
     * @param libraries
     */
    public void setLibraries(List<Library>libraries){
        this.libraries = libraries;
    }

    /**
     * getLibraries() method
     * a getter method for libraries
     * @return libraries
     */
    public List<Library> getLibraries(){
        return this.libraries;
    }

    /**
     * toString() method
     * @return a concatenated string of the member variables
     */
    @Override public String toString(){
        return "Book: " + getBook() + " Libraries: " + getLibraries();
    }
}