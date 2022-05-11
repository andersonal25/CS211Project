import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;

import java.net.URL;
import java.io.DataOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

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
    public void setURL(String url) {
        try{
            this.url = new URL(url);
        }  catch(MalformedURLException e){
            e.printStackTrace();
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
        
        URL url = getURL();
        HttpURLConnection conn = null;
        try{ 
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setDoOutput(true);
            DataOutputStream out = new DataOutputStream(conn.getOutputStream());
            out.writeBytes(request.buildRequestParams());
            out.flush();
            out.close();
        } catch(IOException e){
            e.printStackTrace();
        }

        try{
            BufferedReader br = null;
			int statusCode = conn.getResponseCode();
            
		    if (statusCode >= 200 && statusCode < 400) {
			    br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            } else{
			    br = new BufferedReader(new InputStreamReader((conn.getErrorStream())));
		    }
        } catch (IOException e){
            e.printStackTrace();
        }


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