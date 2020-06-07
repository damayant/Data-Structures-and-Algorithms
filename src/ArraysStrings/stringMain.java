package ArraysStrings;

public class stringMain {
    public static void main(String[] args) {
        //Longest Unique Substring
        String str = "pwwkew";
        longestUniqueSubstring len = new longestUniqueSubstring();
        System.out.println(len.lengthOfLongestSubstring(str));

        System.out.println("**********************************************************************");

        String num1 = "123456789";
        String num2 = "987654321";
        multiplyStrings m = new multiplyStrings();
        System.out.println(m.multiply(num1,num2));

    }
}
