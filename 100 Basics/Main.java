import java.util.*;

public class Main{
    public static int lengthOfString (String str ) {
        int cnt = 0;
        
        try {
            while(true) {
                str.charAt(cnt);
                cnt++;
            }
            
        } catch (StringIndexOutOfBoundsException e) {
        }
        return cnt;

    }

    //Count the number of vowels and consonants
    public static void countVowelAndConsonants (String str) {
        int vowel = 0;
        int consonants = 0;
        str = str.toLowerCase();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowel++;
                } else{
                    consonants++;
                }
            }
        }
        System.out.println("Number of vowels are:" + vowel);
        System.out.println("Numbe of consonants are:" + consonants);
    }

    public static void reverseString(String str) {
        String st = str;
        String rev = "";
        for(int i= str.length()-1; i>=0; i--){
            rev += str.charAt(i);

        }
        //  System.out.println("Reversed String is: " + rev);
        if(rev.equals(st)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }

    }

    public static void upperToLower(String str){
        String upper = "";
        String lower = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            //lower to upper
            if(ch >= 'a' && ch <= 'z'){
                upper += (char) (ch - 32);
            } else{
                upper += ch;
            }
            if(ch >= 'A' && ch <= 'Z'){
                lower += (char)(ch + 32);
                
            } else {
                lower += ch;
            }
        }
        System.out.println("Uppercases string are: " + upper);
        System.out.println("Lower case string are: " + lower);
    }

    //Frequency of ezch charachter
    public static void frequencyOfChar(String str) {
        boolean[] visited = new boolean[str.length()];
        for(int i=0; i < str.length(); i++){
            if(visited[i])
             continue;


             int count = 1;
             for(int j = i + 1; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                     count++;
                     visited[j] = true;

                }
             }
            //  System.out.println(str.charAt(i) + " = " + count);
            if(count == 1);
            System.out.println(str.charAt(i));
        }

    }

    //Anagrams check
    public static void checkAnagrams(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length() != str2.length()){
            System.out.println("Strings are not anagrams");
            return ;
        }
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1, ch2)){
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are not anagrams");
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        // int result = lengthOfString(str);
        //System.out.println("Length of the string is" + result);
        // countVowelAndConsonants(str);
        // reverseString(str);
        // upperToLower(str);
        frequencyOfChar(str);
    }
}