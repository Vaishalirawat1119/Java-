public class MaxIn2DArray {
    public static void main(String[] s){
        int[][] arr = {
                {1,3,5,7},
                {2,4,6,80,10},
                {11,13,15,19},
                {23,34,12,67}
        };

        System.out.println(max(arr));
    }

    static int max(int[][] arr){
        int maximum = arr[0][0];

        for(int row=1; row<arr.length; row++){
            for(int col=1; col<arr[row].length; col++){
                if(arr[row][col] > maximum){
                    maximum = arr[row][col];
                }
            }
        }
        return maximum;
    }
}
