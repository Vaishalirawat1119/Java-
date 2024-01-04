public class FloorNumber {
    public static void main(String[] s){
        int[] arr = {3,5,7,11,12,19,34,53,57,61,72};
        int target = 19;

        int ans = SearchFloor(arr, target);
        System.out.println(ans);
    }

    static int SearchFloor(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;

        while(s<=e){
            int mid = s+(e-s)/2;

            if(target < arr[mid]){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return e;
    }
}
