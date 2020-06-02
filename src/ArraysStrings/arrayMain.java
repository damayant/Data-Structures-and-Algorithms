package ArraysStrings;

public class arrayMain {
    public static void main(String[] args) {
        int[] arr1 = {1,8,6,2,5,4,8,3,7};
        mostWaterContainingContainer maxAreaCalculate =  new mostWaterContainingContainer();
        System.out.println(maxAreaCalculate.maxArea(arr1));
    }
}
