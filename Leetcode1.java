/*
Given two arrays of integers nums and index. Your task is to create target array under the following rules:

Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.
 */

import java.util.*;

class Leetcode1
{
    public static int[] createTargetArray(int[] nums,int[] index)
    {
        int[] target = new int[nums.length];

        List<Integer> targetList = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            targetList.add(index[i],nums[i]);
        }

        for(int i=0;i<targetList.size();i++)
        {
            target[i] = targetList.get(i);
        }

        return  target;
    }

    public static void main(String[] args){
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        int[] answer = createTargetArray(nums,index);

        for(int i=0;i<answer.length;i++)
        {
            System.out.println(answer[i]);
        }
    }
}