package algorithm;

public class palindrome {
    public boolean checkIfPalindrome(String input)
    {
        //reverse the input
        String reversedInput = "";
        for(int i=input.length()-1;i>=0;i--)
        {
            reversedInput += input.charAt(i);
        }

        if(reversedInput.equals(input))
        {
            return true;
        }
        return false;

    }
}
