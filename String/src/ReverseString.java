public class ReverseString {
    public static void main(String[] args) {
        String name = "Vaishali";
        String str ="";
        char ch;
        System.out.println("Original String: " +name);

        for(int i=0; i<name.length(); i++){

            //Extract each character.
            ch = name.charAt(i);

            //Add each character in front of the existing string space.
            str = ch+str;
        }
        System.out.println("Reversed String: " +str);
    }

}
