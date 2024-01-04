public class FindGivInt {
    public static void main(String[] args) {
        int[] num = {25,36,72,13,45};
        int givInt = 40;

        boolean isInArray = false;

        for(int element : num){
            if(givInt == element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("present in an array");
        }
        else{
            System.out.println("not present in an array");
        }

    }
}
