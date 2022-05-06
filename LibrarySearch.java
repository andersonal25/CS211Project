import java.util.ArrayList;
import java.util.List;
/**
 * LibrarySearch class
 * reference citation: https://www.scrapingbee.com/blog/introduction-to-web-scraping-with-java/
 * This class is a web scrapper of the FCPL library website that will pull book availability
 * and book availability locations for the user based on their search from the CLI
 */

// used program HtmlUnit

public class LibrarySearch {

    /**
     * LibrarySearch() no arg constructor
     * 
     */
    public LibrarySearch(){
        
    }
    
    // Define the search term
    String searchQuery = "harry potter and the goblet of fire";

    // Instantiate the client
    WebClient client = new WebClient();
    client.getOptions().setCssEnabled(false);
    client.getOptions().setJavaScriptEnabled(false);
  
    // Set up the URL with the search term and send the request
    String searchUrl= "https://fcplcat.fairfaxcounty.gov/search/searchresults.aspx?ctx=1.1033.0.0.1&type=Keyword&term="+ URLEncoder.encode(searchQuery, "UTF-8")+"&by=KW&sort=RELEVANCE&limit=TOM=*&query=&page=0&searchid=1";
    HtmlPage page = client.getPage(searchUrl);
    
    //extract search results from html
    
    //identify tags for search results in html
    
    //extract search results and save as list
    
    
    
    //display search results from command line
    

    /**
     * searchBooks() method
     * searches for books 
     * @param request
     * @return the results (list of books) of the search
     */
    
//    public List<BookSearchResult> searchBooks(BookSearchRequest request){
//        // TO DO: Add temporary canned results for testing
//        List<BookSearchResult>results = new ArrayList<BookSearchResult>();
//        Book book1 = new Book("9780547249643", "Fiction", "George Orwell", "1984", "San Diego: Harcourt Brace Jovanovich");
//        Library library1 = new Library("City of Fairfax Regional Library");
//
//        Book book2 = new Book("9780452284241", "Fiction", "George Orwell", "Animal Farm", "New York : Harcourt");
//        Library library2 = new Library("Burke Centre Library");
//
//        List<Library>libraries = new ArrayList<Library>();
//        libraries.add(library1);
//        libraries.add(library2);
//
//        BookSearchResult bsr1 = new BookSearchResult(book1, libraries);
//        BookSearchResult bsr2 = new BookSearchResult(book2, libraries);
//
//        results.add(bsr1);
//        results.add(bsr2);
//        return results;
    }
}