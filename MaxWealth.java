public class MaxWealth {
    public static void main(String[] s){
        int[][]arr = {{1,2,4},{4,1,5},{2,1,3}};

        int sol = MaximumWealth(arr);
        System.out.println("Answer is "+sol);
    }
    static int MaximumWealth (int[][]arr){

        int ans = -1;
        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=0; j<arr.length; j++){
                sum += arr[i][j];
            }

            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
