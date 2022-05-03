import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class BookSearchCLI {

    public static List<BookSearchResult> searchByTitle(String title){
        ArrayList<BookSearchResult>results = new ArrayList<>();
        return results;
    }

    public static List<BookSearchResult> searchByAuthor(String author){
        ArrayList<BookSearchResult>results = new ArrayList<>();
        return results;
    }

    public static List<BookSearchResult> searchByISBN(String ISBN){
        ArrayList<BookSearchResult>results = new ArrayList<>();
        return results;
    }

    /**
     * promptInput() method
     * prompts user to enter field param
     * @param field
     * @return the String
     */
    public static String promptInput(String field){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the " + field + "to search: ");
        String searchCriteria = input.nextLine();
        input.close();
        return searchCriteria;
    }

    /**
     * getTitle() method
     * calls promptInput() for title
     * @return the String
     */
    public static String inputTitle(){
        return promptInput("title");
    }

    /**
     * getAuthor() method
     * calls promptInput() for author
     * @return the String
     */
    public static String inputAuthor(){
        return promptInput("author");
    }

    /**
     * getISBN() method
     * calls promptInput() for ISBN
     * @return the String
     */
    public static String inputISBN(){
        return promptInput("ISBN");
    }

    public static int displayMenu(){
        int item;
        System.out.println("1. Search by title");
        System.out.println("2. Search by author");
        System.out.println("3. Search by ISBN");
        System.out.println("0. Exit");
        System.out.println("Choose from the options listed below (1-4): ");
        Scanner input = new Scanner(System.in);
        item = input.nextInt();
        input.close();
        return item;
    }

    public static void main(String[] args) {
        boolean exit = false;
        int item;

        do{
            item = displayMenu();

            List<BookSearchResult>results = null;

            switch(item){
                case 1:
                    System.out.println("You chose to search by title.");
                    results = BookSearchCLI.searchByTitle(BookSearchCLI.inputTitle());
                    break;
                case 2:
                    System.out.println("You chose to search by author.");
                    results = BookSearchCLI.searchByAuthor(BookSearchCLI.inputAuthor());
                    break;
                case 3:
                    System.out.println("You chose to search by ISBN.");
                    results = BookSearchCLI.searchByISBN(BookSearchCLI.inputISBN());
                    break;
                case 0: 
                    System.out.println("You chose to exit.");
                    exit = true;
                    break;
                default:
                    System.out.println("You did not select a correct option. Please try again.");
            }
        } while (!exit);
        System.out.println("Goodbye.");
    }
}