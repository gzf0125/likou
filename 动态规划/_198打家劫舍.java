package 动态规划;

public class _198打家劫舍 {
    public int rob(int[] nums) {
        if (nums==null ||nums.length==0) return 0;
        int lenght=nums.length;
        if (lenght==1) return nums[0];
        int dp[]=new int[lenght];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for (int i=2;i<lenght;i++){
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[lenght-1];
    }
    public int rob1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        int first = nums[0], second = Math.max(nums[0], nums[1]);
        for (int i = 2; i < length; i++) {
            int temp = second;
            second = Math.max(first + nums[i], second);
            first = temp;
        }
        return second;


    }

}
