public class BookSearchRequest extends SearchRequest {
    private SearchFilter searchTerm;

    public BookSearchRequest(SearchFilter searchTerm){
        setSearchTerm(searchTerm);
    }

    public void setSearchTerm(SearchFilter searchTerm){
        this.searchTerm = searchTerm;
    }

    public SearchFilter getSearchTerm(){
        return this.searchTerm;
    }
}