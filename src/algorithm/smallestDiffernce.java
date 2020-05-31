package algorithm;

import java.util.Arrays;

public class smallestDiffernce {
    //time complexity: O(aloga+blogb)
    public int findSmallestDifference(int[] arr1, int[] arr2)
    {
        //if the arrays are not sorted , first sort the arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int p =0;
        int q =0;
        int[] resultArr = new int[2];

        int min = Integer.MAX_VALUE;

        while(p <arr1.length && q<arr2.length)
        {
            if(Math.abs(arr1[p]-arr2[q])<min)
            {
                min = Math.abs(arr1[p]-arr2[q]) ;
                resultArr[0] = arr1[p];
                resultArr[1] = arr2[q];
            }
            /* Move smaller value*/
            if(arr1[p]<arr2[q])
            {
                p++;
            }
            else
            {
                q++;
            }
        }
        return min;
    }
}
