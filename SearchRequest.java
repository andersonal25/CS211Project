/**
 * SearchRequest class
 * represents user's request to be sent to the library search site
 */
public abstract class SearchRequest {
    private int maxResults; // max results of user's search
    private SearchLanguage language; // language user wants of the searchTerm to be searched

    /**
     * SearchRequest() one arg constructor
     * @param searchTerm user's search keyword/term
     */
    public SearchRequest(){
        this(10, SearchLanguage.All);
    }

    /**
     * SearchRequest() three arg constructor
     * @param searchTerm user's search keyword/term
     * @param maxResults max results of user's search
     * @param language language user wants of the searchTerm to be searched
     */
    public SearchRequest(int maxResults, SearchLanguage language){
        setMaxResults(maxResults);
        setLanguage(language);
    }

    /**
     * setMaxResults() method
     * a setter method for maxResults
     * @param maxResults
     */
    public void setMaxResults(int maxResults){
        this.maxResults = maxResults;
    }

    /**
     * getMaxResults() method
     * a getter method for maxResults
     * @return maxResults
     */
    public int getMaxResults(){
        return this.maxResults;
    }

    /**
     * setLanguage() method
     * a setter method for language
     * @param language
     */
    public void setLanguage(SearchLanguage language){
        this.language = language;
    }

    /**
     * getLanguage() method
     * a getter method for language
     * @return lamguage
     */
    public SearchLanguage getLanguage(){
        return this.language;
    }

    /**
     * toString() method
     * @return concatenated string of member variables/user's search request
     */
    @Override public String toString(){
        return "Max Results: " + Integer.toString(getMaxResults()) + ", Language: " + getLanguage();
    }
}