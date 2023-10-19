import java.util.*;

//Swapping 2 numbers without using 3rd variable.

class SwapNumWithoutUsing3rdVariable {
    public static void main(String[] S){
        System.out.println("Enter the value of x and y : ");
        Scanner input = new Scanner (System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println("Before Swapping : " + x + " " + y);

        //Swapping

        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println("After Swapping : " + x + " " + y);
    }

}
