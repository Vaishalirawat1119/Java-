public class MissingElement {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
        System.out.println(MissingNum(arr));
    }

    static int MissingNum(int[] arr){
        int i=0;
        while(i<arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                //For Swapping
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        //search for missing element
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }
}
