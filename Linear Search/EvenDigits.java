public class EvenDigits {
    public static void main(String[] s) {
        int[] arr = {1, 14, 1, 4, 3211, 46, 45253};

        System.out.println(FindNumbers(arr));
    }

    static int FindNumbers(int[] arr){
        int count = 0;

        for(int num : arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numberOfDigits = digit(num);

        return numberOfDigits %2 == 0;
    }

    static int digit(int num){
        int count = 0;

        while(num > 0){
            count++;
            num = num /= 10;
        }

        return count;
    }
}
