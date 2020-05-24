package algorithm;

import java.util.HashMap;
import java.util.List;

public class checkTwoBST {
    public boolean isSimilar(List<Integer> bstOne,List<Integer> bstTwo)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(Integer i :bstOne)
        {
            if(!map.containsValue(bstOne.get(i)))
            {
                map.put(i,bstOne.get(i));
            }
        }
        for(Integer i:bstTwo)
        {
            if(!map.containsValue(bstOne.get(i)))
            {
                return false;
            }
        }
        return true;
    }

}
