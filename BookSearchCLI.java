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
    public static List<BookSearchResult>searchBooks(SearchBy searchBy){
        ArrayList<BookSearchResult>results = new ArrayList<>();
        
        LibrarySearch searcher = new LibrarySearch();
        BookSearchRequest bookSearchRequest = new BookSearchRequest(searchBy);
        searcher.searchBooks(bookSearchRequest);
        return results;
    }

    /**
     * promptInput() method
     * prompts user to enter field param
     * @param field
     * @return the String
     */
    public static String promptInput(SearchBy field){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the " + field + "to search: ");
        String searchCriteria = input.nextLine();
        input.close();
        return searchCriteria;
    }

    public static BookSearchResult selectBookSearchResult(List<BookSearchResult> result){
        BookSearchResult b = new BookSearchResult();
        return b;
    }

    public static void geoSearchLibraries(BookSearchResult selectedResult){
        // call Yash's search method

    }

    /**
     * displayMenu() method
     * displays the menu options for the user to choose from
     * @return the item the user chooses
     */
    public static SearchBy selectSearchBy(){
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


        Scanner input = new Scanner(System.in);
        i = input.nextInt();
        input.close();

        if(i < searchBy.size() || i > searchBy.size()){
            return SearchBy.Any;
        } 
        return searchBy.get(i);
    }

    public static SearchLanguage selectLanguage(){
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


        Scanner input = new Scanner(System.in);
        i = input.nextInt();
        input.close();

        if(i < searchLanguage.size() || i > searchLanguage.size()){
            return SearchLanguage.English;
        } 
        return searchLanguage.get(i);
    }

    /**
     * main() method
     * @param args
     */
    public static void main(String[] args) {
        boolean exit = false;
        SearchBy searchBy;

        do{
            searchBy = selectSearchBy();

            List<BookSearchResult>results = null;
            BookSearchResult selectedResult = null;

            results = searchBooks(searchBy);
            switch(item){
                case 1:
                    System.out.println("You chose to search by title.");
                    results = BookSearchCLI.searchByTitle(BookSearchCLI.inputTitle());
                    selectedResult = selectBookSearchResult(results);
                    break;
                case 2:
                    System.out.println("You chose to search by author.");
                    results = BookSearchCLI.searchByAuthor(BookSearchCLI.inputAuthor());
                    selectedResult = selectBookSearchResult(results);
                    break;
                case 3:
                    System.out.println("You chose to search by ISBN.");
                    results = BookSearchCLI.searchByISBN(BookSearchCLI.inputISBN());
                    selectedResult = selectBookSearchResult(results);
                    break;
                case 0: 
                    System.out.println("You chose to exit.");
                    exit = true;
                    break;
                default:
                    System.out.println("You did not select a correct option. Please try again.");
            }
            BookSearchCLI.geoSearchLibraries(selectedResult);
        } while (!exit);
        System.out.println("Goodbye.");
    }
}