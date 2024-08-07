import java.util.*;
public class strings {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a string:");
        // String str1 = sc.nextLine();
        // int count = 0;

        // for(int i=0; i<str1.length(); i++){
        //     char ch = str1.charAt(i);
        //     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        //         count ++;
        //     }
        // }
        // System.err.println("Count of vowels is : " + count);

        String str1 = "earth";
        String str2 = "heart";
        //*conver Strings to lowercase. Why? so that we dont have tp check seperately for lower & uppercase */
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //*First check - if the lenghts are the same */
        if(str1.length() == str2.length()){
            //*convert strings into char array */
            char[] str1charArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();
            //*sort */
            Arrays.sort(str1charArray);
            Arrays.sort(str2CharArray);

            //*if the sorted char arrays are same or identical then the strings are anagram */
            boolean result = Arrays.equals(str1charArray, str2CharArray);
            if(result){
                System.err.println(str1 + " and " + str2 + " are anagrams of each other.");
            }
            else{
                System.out.println(str1 + " and " + str2 + " are not anagram of each other.");
            }
        }
        else{
            //*case lengths are not equal */
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }
    }
}
