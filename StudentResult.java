import java.util.*;
class StudentResult {
    public static void main(String[] S){
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter your roll number (1-100): ");

        int RollNo = ss.nextInt();
        if(RollNo >= 1 && RollNo <= 100){
            System.out.println("Enter marks for subject 1 (<=100): ");
            int Subject1Marks = ss.nextInt();

            System.out.println("Enter marks for subject 2 (<=100): ");
            int Subject2Marks = ss.nextInt();

            System.out.println("Enter marks for subject 3 (<=100): ");
            int Subject3Marks = ss.nextInt();

            if(Subject1Marks >= 40 && Subject2Marks >= 40 && Subject3Marks >= 40){
                int TotalMarks = Subject1Marks + Subject2Marks + Subject3Marks;
                double percentage = (TotalMarks / 3.0);

                System.out.println("Roll Number: " +RollNo);
                System.out.println("Percentage: " +percentage + "%");
            }
            else {
                System.out.println("Sorry, you have failed in one or more subjects.");
            }
        }
        else{
            System.out.println("Please enter your valid roll number (1-100).");
        }
    }
}
