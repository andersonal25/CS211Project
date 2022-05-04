public class LibrarySearch {
    // Define the search term
    String searchQuery = "harry potter and the goblet of fire";

    // Instantiate the client
    WebClient client = new WebClient();
    client.getOptions().setCssEnabled(false);
    client.getOptions().setJavaScriptEnabled(false);
  
    // Set up the URL with the search term and send the request
    String searchUrl = "https://fcplcat.fairfaxcounty.gov/search/searchresults.aspx?ctx=1.1033.0.0.1&type=Keyword&term="+ URLEncoder.encode(searchQuery, "UTF-8");
    HtmlPage page = client.getPage(searchUrl);

    public static List<BookSearchResuls> searchBooks(BookSearchRequest result){
        List<BookSearchResult>results = null;

    }
  }
}