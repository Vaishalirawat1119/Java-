public class MissingNum {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        int n = 9;
        int expectedTotal = (n*(n+1))/2;
        int result = 0;
        for(int element:arr){
            result += element;
        }
        System.out.println(expectedTotal - result);
    }
}
