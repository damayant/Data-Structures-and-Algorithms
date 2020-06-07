package algorithm;

public class stringEasy {
    public static void main(String[] args) {

        String input = "abcdcba";
        palindrome check = new palindrome();
        System.out.println(check.checkIfPalindrome(input));

        System.out.println("*********************************************************");

        String str1 ="flop";
        String str2 = "olfp";
        anagramChecks checkString = new anagramChecks();
        System.out.println(checkString.checkAnagram(str1,str2));
    }

}
