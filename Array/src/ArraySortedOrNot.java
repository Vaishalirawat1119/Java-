public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[]arr = {2,4,6,7,9};

        boolean isASortedArray = true;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                isASortedArray = false;
            }
        }
        if(isASortedArray){
            System.out.println("Sorted Array");
        }
        else{
            System.out.println("Not an Sorted Array");
        }
    }
}
