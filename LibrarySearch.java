import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.net.URL;
import java.net.HttpURLConnection;

/**
 * LibrarySearch class
 */
public class LibrarySearch {
    public static final String URL_DEFAULT = "https://fcplcat.fairfaxcounty.gov/search/searchresults.aspx";
    URL url;

    /**
     * LibrarySearch() no arg constructor
     * 
     */
    public LibrarySearch(){
        this(URL_DEFAULT);
    } 

    /**
     * LibrarySearch() one arg constructor
     * 
     */
    public LibrarySearch(String url){
        setURL(url);
    }

    /**
     * setURL() method
     * a setter method for url
     * @param url
     * @throws MalformedURLException
     */
    public void setURL(String url) throws MalformedURLException{
        try{
            this.url = new URL(url);
        }  catch(IOException e){
            e.printStackTrace;
        }
        
    }
    
    /**
     * getURL() method
     * a getter method for url
     * @return url
     */
    public URL getURL(){
        return this.url;
    }


    /**
     * searchBooks() method
     * searches for books 
     * @param request
     * @return the results (list of books) of the search
     */
    public List<BookSearchResult> searchBooks(BookSearchRequest request){
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");


        // TO DO: Add temporary canned results for testing
        List<BookSearchResult>results = new ArrayList<BookSearchResult>();
        Book book1 = new Book("9780547249643", "Fiction", "George Orwell", "1984", "San Diego: Harcourt Brace Jovanovich");
        Library library1 = new Library("City of Fairfax Regional Library");

        Book book2 = new Book("9780452284241", "Fiction", "George Orwell", "Animal Farm", "New York : Harcourt");
        Library library2 = new Library("Burke Centre Library");

        List<Library>libraries = new ArrayList<Library>();
        libraries.add(library1);
        libraries.add(library2);

        BookSearchResult bsr1 = new BookSearchResult(book1, libraries);
        BookSearchResult bsr2 = new BookSearchResult(book2, libraries);

        results.add(bsr1);
        results.add(bsr2);
        return results;
    }
}