public class LinearSearch {
    public static void main(String[] s){
        int[] arr = {11, 23, 33, 12, 1, 76};
        int target = 33;
        int ans = Linearsearch(arr, target);
        System.out.println("The target: "+target + " is at "+ ans +" index");
    }
    static int Linearsearch(int[] arr, int target){
        if (arr.length == 0){
            System.out.println("Array is empty");
        }
        for(int i = 0; i < arr.length; i++) {
            int element = arr[i];

            if (element == target) {
                return i;

            }
        }
        return -1;
    }
}
