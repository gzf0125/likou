package 贪心算法;

import java.util.Arrays;

public class _976三角形的最大周长 {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        for (int i=nums.length-1;i>=2;i--){
            if (nums[i-2]+nums[i-1]>nums[i]){
                c=nums[i-2]+nums[i-1]+nums[i];
            }
        }
        return c;
    }
}
