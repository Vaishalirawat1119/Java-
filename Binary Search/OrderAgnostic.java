public class OrderAgnostic {
    public static void main(String[] s){
        int[] arr = {87,67,62,50,54,51,47,32,12,7,4,-1};
        int target = 12;

        int ans = OABinarySearch(arr,target);
        System.out.println(ans);
    }

    static int OABinarySearch(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;

        //Check Whether the given array is in Ascending or Descending oder.

        boolean isAsc;
        if(arr[s]<arr[e]){
            isAsc = true;
        }
        else{
            isAsc = false;
        }

        while(s <= e){
            int mid = s + (e-s)/2;

            if(target == arr[mid]){
                return mid;
            }

            if (isAsc){
                if(target < arr[mid]){
                    e = mid-1;
                }
                else{
                    s = mid+1;
                }
            }
            else{
                if(target > arr[mid]){
                    e = mid-1;
                }
                else{
                    s = mid+1;
                }
            }
        }
        return -1;
    }
}

