import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            int min_index = i;

            for (int j = i + 1; j < size; j++) {

                // Select the minimum element in each loop.
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            // put min at the correct position
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

    }
}

