package ArraysStrings;
//find no of unique nos in an array w/o any extra space
public class uniqueNumber {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,4,4};
        uniqueNumber helper = new uniqueNumber();
        System.out.println(helper.findUniqueNo(nums));
    }
    public int findUniqueNo(int[] arr)
    {
        int i=0;
        for(int j=1;j<arr.length;j++)
        {
            if(arr[i]!=arr[j])
            {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}
