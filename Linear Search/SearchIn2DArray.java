import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] s){
        int[][] arr = {
                {1,3,5,7},
                {2,4,6,8,10},
                {11,13,15,19},
                {23,34,12,67}
        };

        int target = 34;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){
        if (arr.length == 0){
            System.out.println("Array is empty");
        }

        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col]==target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
