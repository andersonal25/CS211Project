import java.util.Scanner;

import javax.sound.midi.Soundbank;
import javax.sound.sampled.SourceDataLine;
public class BookSearchCLI {

    public String searchByTitle(String title){

    }

    public String searchByAuthor(String author){

    }

    public String searchByISBN(String ISBN){

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