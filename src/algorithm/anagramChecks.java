package algorithm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class anagramChecks {
    public boolean checkAnagram(String str1, String str2)
    {
        if(str1.length()!=str2.length())
        return false;
        else
        {
            char[] chArr1 = str1.toCharArray();
            char[] chArr2 = str2.toCharArray();
            Arrays.sort(chArr1);
            String sortedStr1 = new String(chArr1);
            Arrays.sort(chArr2);
            String sortedStr2 = new String(chArr2);

            if(sortedStr1.equals(sortedStr2))
            {
                return true ;
            }

        }
        return false;
    }

    public List<List<String>> checkGroupAnagram(List<String> string_list)
    {
        List<List<String>> result = new ArrayList<>();
        HashMap<String ,List<String>> map = new HashMap<>(); //map the sorted words with the actual word list

        for(String str:string_list)
        {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String key = new String(charArr);

            if(map.containsKey(key))
            {
                map.get(key).add(str); //-> map value chaining happens here for multiple words with same anagram
            }
            else
            {
                List<String> strList = new ArrayList<>();
                strList.add(str);
                map.put(key,strList);
            }

        }
        result.addAll(map.values());
        return  result;
    }
}
