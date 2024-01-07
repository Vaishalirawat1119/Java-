public class Palindrome {
    public static void main(String[] args) {
        String str = "noon";
        int i=0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println("Not a PALINDROME");
                System.exit(0);
            }
            i++;
            j--;
        }
        System.out.println("It's a PALINDROME");
    }
}
