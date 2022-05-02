import java.util.Scanner;

public class BookSearchCLI {

    public List<Book> searchByTitle(String title){

    }

    public List<Book> searchByAuthor(String author){

    }

    public List<Book> searchByISBN(String ISBN){

    }

    /**
     * promptInput() method
     * prompts user to enter field param
     * @param field
     * @return the String
     */
    public String promptInput(String field){
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
    public String getTitle(){
        return promptInput("title");
    }

    /**
     * getAuthor() method
     * calls promptInput() for author
     * @return the String
     */
    public String getAuthor(){
        return promptInput("author");
    }

    /**
     * getISBN() method
     * calls promptInput() for ISBN
     * @return the String
     */
    public String getISBN(){
        return promptInput("ISBN");
    }

    public String search(String title, String author, String ISBN){

    }

    public static int displayMenu(){
        System.out.println("1. Search by title");
        System.out.println("2. Search by author");
        System.out.println("3. Search by ISBN");
        System.out.println("4. Exit");
    }

    private displayResults(){
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        int item;

        do{
            displayMenu();
            System.out.println("Choose from the options listed below (1-4): ");
            item = input.nextInt();

            switch(item){
                case 1:
                    System.out.println("You chose to search by title.");
                    break;
                case 2:
                    System.out.println("You chose to search by author.");
                    break;
                case 3:
                    System.out.println("You chose to search by ISBN.");
                    break;
                case 4: 
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