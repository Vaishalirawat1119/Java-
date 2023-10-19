import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Close the scanner
        scanner.close();


        if ((number & 1) == 1) {
            System.out.println(number + " is an odd number.");
        } else {
            System.out.println(number + " is an even number.");
        }
    }
}

