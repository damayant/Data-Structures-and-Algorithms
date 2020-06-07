package algorithm;

import java.util.List;

public class arrayMain {
    public static void main(String[] args) {
        int[] arr = {-1, 5, 10, 20, 28, 3};
        int[] arr1 = {26, 134, 135, 15, 17};
        int targetSum = -5;
        twoSum sum = new twoSum();
        int[] result =sum.checkSum(arr,targetSum) ;
        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i]);

        }
        System.out.println("**************************************************");
        smallestDiffernce diff = new smallestDiffernce();
        System.out.println(diff.findSmallestDifference(arr,arr1));

        int[] arr3 = {-1, 0, 1,2, -1, -4};
        int target = 0;
        threeSum sumProb = new threeSum();
        List<List<Integer>> resultThreeSumm = sumProb.checkThreeSum(arr3,target);
        System.out.println(resultThreeSumm);

    }
}