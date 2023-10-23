public class MaxElement {
    public static void main(String[] s){
        int[] arr = {10, 29, -5, 3, 23,30};

        System.out.println(max(arr));
    }

    static int max(int[] arr){
        if (arr.length == 0){
            System.out.println("Array is empty");
        }

        int ans = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
