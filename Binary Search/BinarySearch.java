public class BinarySearch {
    public static void main(String[] s){
        int[] arr = {2,4,6,10,12,14,23,45,50};
        int target = 23;

        int ans = SearchElement(arr,target);
        System.out.println(ans);
    }

    static int SearchElement(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
