/*Given an array of integers nums, write a method that returns the "pivot" index of this array.

We define the pivot index as the index where the sum of all the numbers to the left of the index is equal to the sum of all the numbers to the right of the index.

If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.
 */


public class pivotIndex {
    public static void main(String[] args)
    {
        int[] arr = {1,7,3,6,5,6};
        System.out.println(findPivot(arr));
        int[] arr1 = {1,2,3};
        System.out.println(findPivot(arr1));
    }

    public static int findPivot(int[] arr)
    {
        int sumOfArray = 0, leftSum = 0 ;

        //find the sum of all the elements in the array
        for(int x:arr)
        {
            sumOfArray += x ;
        }

        //check if there exists any pivot whose left elements sum upto the right elements
        for(int i=0;i<arr.length;++i)
        {
            if (leftSum == sumOfArray - arr[i] - leftSum) return i;
            leftSum += arr[i] ;
        }
        return -1;
    }
}
