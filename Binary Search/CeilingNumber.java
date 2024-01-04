public class CeilingNumber {
    public static void main(String[] s){
        int[]arr = {2,3,5,9,14,16,18};
        int target = 15;

        int ans = SearchCeiling(arr, target);
        System.out.println(ans);
    }

    static int SearchCeiling(int[]arr, int target){
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
        return s;
    }
}

