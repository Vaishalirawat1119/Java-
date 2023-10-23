public class MinElement {
    public static void main(String[] s){
        int[] arr = {11, 12, -3, 1, 5};

        System.out.println(min(arr));
    }

    static int min(int[] arr){
        if (arr.length == 0){
            System.out.println("Array is empty");
        }
        
        int sol = arr[0];
        
        for(int i=1; i<arr.length; i++){
            if(arr[i] < sol){
                sol = arr[i];
            }
        }
        return sol;
    }
}
