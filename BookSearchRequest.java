public class BookSearchRequest extends SearchRequest {
    private String searchTerm; // user's search keyword/term
    private int maxResults; // max results of user's search
    private SearchLanguage language; // language user wants of the searchTerm to be searched

    /**
     * SearchRequest() one arg constructor
     * @param searchTerm user's search keyword/term
     */
    public BookSearchRequest(String searchTerm){
        super(searchTerm);
    }

    /**
     * SearchRequest() three arg constructor
     * @param searchTerm user's search keyword/term
     * @param maxResults max results of user's search
     * @param language language user wants of the searchTerm to be searched
     */
    public BookSearchRequest(String searchTerm, int maxResults, SearchLanguage language){
        super(searchTerm, maxResults, language);
    }

}