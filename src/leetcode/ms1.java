//Given an array of numbers find the highest sum of 2 Numbers such that sum of the digits of the numbers are equal//

package leetcode;

import java.io.*;
import java.util.*;
import java.math.*;

public class ms1 {

    public static Integer findDigitSum(int digit)
    {
        int sum = 0;
        int n =0;
        while(digit>0)
        {
            n = digit%10 ;
            sum = sum + n ;
            digit = digit/10;
        }
        return sum;
    }

    public static int findHighestSum(int[] arr)
    {
        int[] list = new int[arr.length];
        int highest_sum = 0;
        HashMap<Integer, HashSet<Integer>> map = new HashMap<Integer, HashSet<Integer>>();
        for(int i=0;i<arr.length;i++)
        {
            Integer sum = findDigitSum(arr[i]);
            if(!map.containsKey(sum))
            {
                map.put(sum,new HashSet<>(arr[i]));
            }

        }

        return highest_sum;
    }

    public  static void  main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int digit = s.nextInt();
        int answer = findDigitSum(digit);
        System.out.println(answer);

    }
}
