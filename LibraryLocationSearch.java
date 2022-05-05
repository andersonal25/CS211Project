import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.json.JSONObject;
import org.apache.http.*;

public class LibraryLocationSearch {

	/*	@SuppressWarnings("static-access")
	public static void search()
	{
		BookSearchCLI booksearch = null;
		String searchstring="";
		searchstring = booksearch.inputTitle();
		searchstring = URLEncoder.encode(searchstring,StandardCharsets.UTF_8);
		OkHttpClient client = new OkHttpClient().newBuilder()
				  .build();
				Request request = new Request.Builder()
				  .url("https://maps.googleapis.com/maps/api/place/findplacefromtext/json?input=Museum%20of%20Contemporary%20Art%20Australia&inputtype=textquery&fields=formatted_address%2Cname%2Crating%2Copening_hours%2Cgeometry&key=YOUR_API_KEY")
				  .method("GET", null)
				  .build();
				Response response = client.newCall(request).execute();
				
	}
*/	
	public static void search(String SearchStr) throws MalformedURLException {
		URL url = null;
		BookSearchCLI booksearch = null;
		String searchstring="";
		searchstring = booksearch.inputTitle();
		searchstring = URLEncoder.encode(searchstring,StandardCharsets.UTF_8);
		try {
//			String surl="https://www.googleapis.com/customsearch/v1?key=AIzaSyCVvong3qOi6jqZogKFQn06owE4njGCVJY&cx=013036536707430787589:_pqjad5hr1a"
//					+ "&safe=active&q='Fairfax+County+public+library+"+searchstring.replace(' ', '+')+"'&alt=json";
//			String surl="https://www.googleapis.com/customsearch/v1?key=AIzaSyCVvong3qOi6jqZogKFQn06owE4njGCVJY&cx=013036536707430787589:_pqjad5hr1a"
//					+ "&safe=active&q='Fairfax+County+public+library+Virginia+"+searchstring.replace(' ', '+')+"'&alt=json";
					String surl="https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=38.834720,-77.312680&radius=50000&type=book-store&keyword=Fairfax+County+Library+"+searchstring.replace(' ', '+')+"&key=AIzaSyCVvong3qOi6jqZogKFQn06owE4njGCVJY";

			url = new URL(surl);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
			/*InputStream sjson = conn.getInputStream();
			String strJson = new String(sjson.readAllBytes(),StandardCharsets.UTF_8);
			JSONObject jobj = new JSONObject(strJson);
			if(! jobj.getString("status").equals("OK"))
				return;
			JSONObject results = jobj.getJSONArray("results").getJSONObject(0);*/
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

