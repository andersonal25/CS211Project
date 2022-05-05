import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class LibraryLocationSearch {

	public static void search(String SearchStr) throws MalformedURLException {
		URL url = null;
		BookSearchCLI booksearch = null;
		String searchstring="";
		//searchstring = booksearch.inputTitle();
		//try {
			String surl="https://www.googleapis.com/customsearch/v1?key=AIzaSyCVvong3qOi6jqZogKFQn06owE4njGCVJY&cx=013036536707430787589:_pqjad5hr1a"
					+ "&safe=active&q='Fairfax+County+public+library+"+searchstring.replace(' ', '+')+"'&alt=json";
//		String surl="https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=-77.312680%2C38.834720&radius=1500&type=library&keyword="+searchstring.replace(' ', '+')+"&key=AIzaSyCVvong3qOi6jqZogKFQn06owE4njGCVJY";
//https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=-33.8670522%2C151.1957362&radius=1500&type=restaurant&keyword=cruise&key=YOUR_API_KEY

			url = new URL(surl);
		//} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
        HttpURLConnection conn = null;
		try {
			conn = (HttpURLConnection) url.openConnection();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			conn.setRequestMethod("GET");
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        conn.setRequestProperty("Accept", "application/json");
        BufferedReader br = null;
		try {
			int statusCode = conn.getResponseCode();
			if (statusCode >= 200 && statusCode < 400) {
			br = new BufferedReader(new InputStreamReader(
			        (conn.getInputStream())));
			}
			else
			{
				br = new BufferedReader(new InputStreamReader(
				        (conn.getErrorStream())));
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        String output;
        //System.out.println("Output from Server .... \n");
        try {
			while ((output = br.readLine()) != null) {
			    System.out.println(output);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        conn.disconnect();
       
	}
	private static String encodeValue(String value) {
	    try {
			return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
	public static void main(String[] args) throws MalformedURLException {

        LibraryLocationSearch libsearch = null;
        libsearch.search("");
    }
}

