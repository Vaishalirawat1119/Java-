import java.util.*;

public class ClassResult {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter marks in 4 subjects
        System.out.println("Enter marks in 4 subjects:");
        int subject1 = scanner.nextInt();
        int subject2 = scanner.nextInt();
        int subject3 = scanner.nextInt();
        int subject4 = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Calculate the total marks
        int totalMarks = subject1 + subject2 + subject3 + subject4;

        // Calculate the percentage
        double percentage = (double) totalMarks / 4;

        // Determine the result based on divisions
        String result;
        if (percentage >= 60) {
            result = "1st Division";
        } else if (percentage >= 50) {
            result = "2nd Division";
        } else if (percentage >= 40) {
            result = "3rd Division";
        } else {
            result = "Fail";
        }

        // Display the result
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Result: " + result);
    }
}

