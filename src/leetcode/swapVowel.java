public class swapVowel {
    public static void main(String[] args)
    {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s)
    {
        //initialising the globals
        StringBuilder result = new StringBuilder(s);
        int counter = 0 ;
        int len = s.length();
        char[] charArr = new char[len];
        for(int i=0;i<len;i++)
        {
            charArr[i] = 'x';
        }

        //check the vowel positions and populate the char array
        for(int i=0;i<len;i++)
        {
            char ch = s.charAt(i);
            if((ch == 'a')||(ch == 'e')||(ch == 'i')||(ch == 'o')||(ch == 'u'))
            {
                charArr[i] = ch ;
                counter++;
            }
        }

        // swapping the chars in the original string
        while(counter >0)
        {
            for(int i=0;i<len;i++)
            {
                if(charArr[i]!='x')
                {
                    for(int j=i+1;j<len;j++)
                    {
                        if(charArr[j]!='x')
                        {
                            if(charArr[i]!=charArr[j])
                            {
                                result.setCharAt(j,charArr[i]) ;
                                result.setCharAt(i,charArr[j]);
                                counter = counter - 2 ;
                            }
                            else
                            {
                                i++;
                            }
                        }
                    }
                }
                counter = counter -1 ;
            }
        }

        return result.toString();
    }
}
