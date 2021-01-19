//https://www.youtube.com/watch?v=pq7Xon_VXeU
package ArraysStrings;

public class trappingRainWater {
    public int maxWater(int[] height)
    {
        int ans = 0;
        int l =0;
        int r = height.length - 1;
        int left_max = 0;
        int right_max = 0;

        while(l<r)
        {
            if(height[l]<height[r])
            {
                if(height[l]>=left_max)
                {
                    left_max = height[l];
                }
                else
                {
                    ans+= left_max - height[l];
                }
                l++;
            }
            else
            {
                if(height[r]>=right_max)
                {
                    right_max = height[r];
                }
                else
                {
                    ans+= right_max - height[r];
                }
                r--;
            }

        }

        return ans;
    }
}
