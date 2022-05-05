/**
 * SearchFilter class
 * encapsulates the search criteria
 */
public class SearchFilter {
    SearchBy searchBy; // category of the search from SearchBy enum
    String keywords; // keywords entered for the search

    /**
     * SearchFilter() constructor
     * sets the class member variables
     * @param searchBy
     * @param keywords
     */
    public SearchFilter(SearchBy searchBy, String keywords){
        setSearchBy(searchBy);
        setKeywords(keywords);
    }

    /**
     * setSearchBy() method
     * a setter method for searchBy
     * @param searchBy
     */
    public void setSearchBy(SearchBy searchBy){
        this.searchBy = searchBy;
    }

    /**
     * getSearchBy() method
     * a getter method for searchBy
     * @return searchBy
     */
    public SearchBy getSearchBy(){
        return this.searchBy;
    }

    /**
     * setKeywords() method
     * a setter method for keywords
     * @param keywords
     */
    public void setKeywords(String keywords){
        this.keywords = keywords;
    }

    /**
     * getKeywords() method
     * a getter method for keywords
     * @return keywords
     */
    public String getKeywords(){
        return this.keywords;
    }

    /**
     * toString() method
     * returns concatenated string of the category o  the s
     */
    @Override public String toString(){
        return "Search by: " + getSearchBy() + " Keywords: " + keywords;
    }
}
