/**
 * BookSearchRequest class
 * encapsulstes the book search request parameters
 */
public class BookSearchRequest extends SearchRequest {
    private SearchFilter searchTerm; // user's search term

    /**
     * BookSearchRequest() one arg constructor
     * sets the searchTerm member variable
     * @param searchTerm
     */
    public BookSearchRequest(SearchFilter searchTerm){
        setSearchTerm(searchTerm);
    }

    /**
     * BookSearchRequest() three arg constructor
     * sets the member variable searchTerm and calls the super class constructor
     * @param searchTerm
     * @param maxResults
     * @param language
     */
    public BookSearchRequest(SearchFilter searchTerm, int maxResults, SearchLanguage language){
        super(maxResults, language);
        setSearchTerm(searchTerm);
    }

    /**
     * setSearchTerm() method
     * a setter method for searchTerm
     * @param searchTerm
     */
    public void setSearchTerm(SearchFilter searchTerm){
        this.searchTerm = searchTerm;
    }

    /**
     * getSearchTerm() method
     * a getter method for searchTerm
     * @return searchTerm
     */
    public SearchFilter getSearchTerm(){
        return this.searchTerm;
    }
}