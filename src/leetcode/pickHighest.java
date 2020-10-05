/*
In a given integer array nums, there is always exactly one largest element.

Find whether the largest element in the array is at least twice as much as every other number in the array.

If it is, return the index of the largest element, otherwise return -1.
 */
public class pickHighest {
    public static void main(String[] args)
    {
        int[] arr = {3, 6, 1, 0};
        System.out.println(findHighestNumber(arr));

        int[] arr1 = {1, 2, 3, 4};
        System.out.println(findHighestNumber(arr1));

    }

    public static int findHighestNumber(int[] arr)
    {
        int high = 0, answer = 0;

        //find the highest number in the array
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>high)
            {
                high = arr[i];
            }
        }

        //now calculate if the highest number is atleast twice or more than twice of the other nos in array
        for(int x:arr)
        {
            if(x!=high)
            {
                if (high>=x*2)
                {
                    answer = high ;
                    continue;
                }
                else
                    answer = -1;
                break;
            }

        }
        return answer;
    }
}
