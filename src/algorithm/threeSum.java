package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class threeSum {
    public List<List<Integer>>checkThreeSum(int[] arr,int targetSum)
    {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        //first store the element in array in hashtable
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],1);
            }
            else
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            int rem1 = targetSum - arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                ArrayList<Integer> sublist = new ArrayList<>();
                int rem2 = rem1 - arr[j];
                if(map.containsKey(rem2))
                {
                    int val1 = (int)map.get(rem2);
                    int val2 = (int)map.get(arr[i]);
                    int val3 = (int)map.get(arr[j]);
                    if(val1>0 && val2 >0 && val3>0)
                    {
                        List<Integer> numList = Arrays.asList( arr[i], arr[j], rem2);
                        sublist.addAll(numList);
                        map.put(arr[i],map.get(arr[i])-1);
                        map.put(arr[j],map.get(arr[j])-1);
                        map.put(rem2,map.get(rem2)-1);
                    }
                }
                if(!sublist.isEmpty())
                {
                    result.add(sublist);
                }
            }
        }
        return result;
    }
}
