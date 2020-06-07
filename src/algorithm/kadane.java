package algorithm;

public class kadane {
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 5, -1, 0, 10} ;
        int result = highestSubarraySum(arr);
        System.out.println(result);
    }
    /* this solution works for both +ve and -ve integers in array*/
    public static int highestSubarraySum(int[] arr)
    {
        int max_so_far = Integer.MIN_VALUE ;
        int max_at_present_index = arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if((max_at_present_index+arr[i])>arr[i])
            {
                max_at_present_index += arr[i] ;
            }

            if(max_so_far<max_at_present_index)
            {
                max_so_far = max_at_present_index ;

            }
        }
        return max_so_far ;
    }

    public static int[] highestSubarraySumPoints(int[] arr)
    {
        int[] result = new int[2];
        int max_so_far = Integer.MIN_VALUE ;
        int max_at_present_index = arr[0];
        int start = 0;
        int end = 0 ;
        int counter = 0 ;

        for(int i=1;i<arr.length;i++)
        {
            if((max_at_present_index+arr[i])>arr[i])
            {
                start = i;
                max_at_present_index += arr[i] ;
                counter ++ ;
            }

            if(max_so_far<max_at_present_index)
            {
                max_so_far = max_at_present_index ;

            }
        }
        return result ;
    }
}
