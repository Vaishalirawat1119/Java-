public class StringSearch {
    public static void main(String[] s){
        String str = "Vaishali";
        char ch = 's';

        System.out.println(SearchStr(str, ch));
    }
    static boolean SearchStr(String str, char ch){
        if(str.isEmpty()){
            return false;
        }

        for(int i = 0; i < str.length(); i++){
            if(ch == str.charAt(i)){
                return true;
            }
        }
        return  false;
    }
}
