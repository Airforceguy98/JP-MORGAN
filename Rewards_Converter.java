import java.util.Scanner;

public class Rewards_Converter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);  // Creates new scanner object for user input
        System.out.println ("Welcome to the Credit Card Rewards Converter! ");

        System.out.println("Please enter a cash value to convert to airline miles: ");
        var user_input = scanner.nextLine();
        double cashvalue;
        try {
            cashvalue = Double.parseDouble(user_input);  // Try parsing user input to double  
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }

        System.out.println("converting $" + user_input + " to miles");
    }
}
