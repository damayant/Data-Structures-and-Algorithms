package ArraysStrings;

public class mostWaterContainingContainer {
    public int maxArea(int[] heights)
    {
        int height = 0 ;
        int width = 0;
        int start = 0 ;
        int end =  heights.length-1;
        int area = 0;

        while(start!=end)
        {
            width = end - start;
            height = Math.min(heights[start],heights[end]);
            area = Math.max(area,height*width);

            if(heights[start]<heights[end])
            {
                start++;
            }
            else
                end-- ;
        }
        return area;
    }
}
