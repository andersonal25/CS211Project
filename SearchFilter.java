public class SearchFilter {
    SearchBy searchBy;
    String keywords;

    public SearchFilter(SearchBy searchBy, String keywords){
        setSearchBy(searchBy);
        setKeywords(keywords);
    }

    public void setSearchBy(SearchBy searchBy){
        this.searchBy = searchBy;
    }

    public SearchBy getSearchBy(){
        return this.searchBy;
    }

    public void setKeywords(String keywords){
        this.keywords = keywords;
    }

    public String getKeywords(){
        return this.keywords;
    }

    @Override public String toString(){
        return "Search by: " + getSearchBy() + " Keywords: " + keywords;
    }
}
