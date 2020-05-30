package algorithm;

public class arrayMain {
    public static void main(String[] args) {
        int[] arr = {-7, -5, -3, -1, 0, 1, 3, 5, 7};
        int targetSum = -5;
        twoSum sum = new twoSum();
        int[] result =sum.checkSum(arr,targetSum) ;
        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i]);

        }

    }
}