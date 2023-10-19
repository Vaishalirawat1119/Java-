public class SearchingInRange {
    public static void main(String[] s){
        int[] arr = {12, 45, 67, 89, 23, 56, 19, 11};
        int target = 67;

        System.out.println(SearchingRange(arr, target, 1, 4));
    }
    static int SearchingRange(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for(int index = start; index <= end; index++){
            int element = arr[index];

            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
