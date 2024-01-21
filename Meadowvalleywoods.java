// Import the Scanner class which will allow us to get input from the user
import java.util.Scanner;

// Create a class called Meadowvalleywoods; note that the class name must match the file name
public class Meadowvalleywoods {

    // Create our main method; this is where the program will always start
    public static void main(String[] args) {

        // Create a welcome output to our user
        System.out.println("\n\n\tWelcome to Meadowvalleywoods, the best place to camp since 1988!\n\n");
        
        // Greet the user and ask for their name
        System.out.println("What might be your name?");
        
        // Create string variable to hold the user's name
        String userName = "";
        
        // Create a scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Get the user's name and store it in the userName Variable
        userName = scanner.nextLine();
        
        // Greet the user by name
        System.out.println("Have you any clue what's lurking in these woods?");
        
        // A response from the user
        // Use a different variable name for the response
        String userResponse = scanner.nextLine();
        
        // Display a welcome message incorporating the user's name
        System.out.println("\n\n*with a slight grin* Welcome " + userName + " to Meadow valley woods ;););) May we wish you good luck in these woods!\n\n");
    }
}
