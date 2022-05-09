import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 * BookSearchCLI class
 * command line interface for the user to search for books at various libraries
 */
public class BookSearchCLI {
    /**
     * searchByTitle() class 
     * for if user wants to search by title
     * @param title
     * @return search results
     */
    public static List<BookSearchResult>searchBooks(BookSearchRequest bookSearchRequest){
        // TO DO: add optional url command line argument to override LibrarySearch default url
        LibrarySearch searcher = new LibrarySearch();
        return searcher.searchBooks(bookSearchRequest);
    }

    private static int promptInt(Scanner input, int maxSize){
        maxSize = 4;
        int i = 1;

        System.out.println("Select 0 to exit.");
        boolean over = false;

        do{
            String in = input.nextLine();
            try{
                i = Integer.parseInt(in);
                if (i >= 0 && i <= maxSize){
                    over = true;
                }
            } catch (NumberFormatException e){
                System.out.println("Try Again! Please enter 0 to exit or an integer between 1 and " + maxSize);

            }
        } while (!over);
        return i;
    }

    /**
     * promptInput() method
     * prompts user to enter field param
     * @param field
     * @return the String
     *
     */
    public static String promptKeywords(SearchBy field, Scanner input){
        System.out.println("Please enter the keywords to search the " + field + " field: ");
        String keywords = input.nextLine();
        return keywords;
    }
     

    /**
     * selectBookSearchResult() method
     * 
     * @param results
     * @return
     */
    public static BookSearchResult selectBookSearchResult(List<BookSearchResult> results){

        int i = 1;
        System.out.println("Please select a book number: ");
        for(BookSearchResult r: results){
            System.out.println(i + ". " + r.getBook().toString());
            i++;
        }

        if (i < 1){
            return null;
        }
        System.out.println("Select 0 to exit.");
        
        Scanner input = new Scanner(System.in);
        i = input.nextInt();
        input.close();

        if(i < 1 || i > results.size()){
            return null;
        } 
        return results.get(i-1);
    }

    /**
     * geoSearchLibraries() method
     * @param selectedResult
     */
    public static void geoSearchLibraries(BookSearchResult selectedResult){
        // call Yash's search method
        System.out.println(selectedResult.toString());
    }

    /**
     * displayMenu() method
     * displays the menu options for the user to choose from
     * @return the item the user chooses
     */
    public static SearchBy selectSearchBy(Scanner input){
        ArrayList<SearchBy>searchBy = new ArrayList<>();

        int i = 1;
        System.out.println("Search Books By:");
        for(SearchBy s: SearchBy.values()){
            searchBy.add(s);
            System.out.println(i + ". " + s);
            i++;
        }
        System.out.println("The default field to search is " + SearchBy.Any);
        System.out.println("Select a field number above to search by.");

        i = promptInt(input, searchBy.size());

        if(i < 0 || i > searchBy.size()){
            return SearchBy.Any;
        }
        return searchBy.get(i-1);
    }

    /**
     * selectLanguage() method
     * 
     * @return
     */
    public static SearchLanguage selectLanguage(Scanner input){
        ArrayList<SearchLanguage>searchLanguage = new ArrayList<>();

        int i = 1;
        System.out.println("Search By Language:");
        for(SearchLanguage s: SearchLanguage.values()){
            searchLanguage.add(s);
            System.out.println(i + ". " + s);
            i++;
        }
        System.out.println("The default search language is " + SearchLanguage.English);
        System.out.println("Select a language above to use to search keywords.");

        i = promptInt(input, searchLanguage.size());

        if(i < 0 || i > searchLanguage.size()){
            return SearchLanguage.English;
        } 
        return searchLanguage.get(i-1);
    }

    /**
     * main() method
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean exit = false;

        do{
            SearchBy searchBy = selectSearchBy();
            //SearchLanguage searchLanguage = selectLanguage();
            SearchLanguage searchLanguage = SearchLanguage.All;
            String keywords = promptKeywords(searchBy);

            if (keywords != null){
                SearchFilter searchFilter = new SearchFilter(searchBy, keywords);
                List<BookSearchResult>results = searchBooks(new BookSearchRequest(searchFilter, searchLanguage));
                BookSearchResult selectedResult = selectBookSearchResult(results);
                BookSearchCLI.geoSearchLibraries(selectedResult);
            } else{
                exit = true;
            }
        } while (!exit);
        System.out.println("Goodbye.");
        input.close();
    }
}