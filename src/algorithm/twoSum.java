package algorithm;

import java.util.HashMap;

public class twoSum {
    public int[] checkSum(int[] arr,int targetSum)
    {
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++)
        {
            int remainder = targetSum - arr[i] ;
            if(map.containsValue(remainder))
            {
                result[0] = arr[i];
                result[1] = remainder ;
            }
            else
            {
                map.put(i,arr[i]);
            }
        }
        return result;
    }
}
