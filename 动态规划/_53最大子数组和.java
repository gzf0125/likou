package 动态规划;

public class _53最大子数组和 {
    public int maxSubArray(int[] nums) {
        int []dp=new int[nums.length];
        dp[0]=nums[0];
        int result=dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
            if (result<dp[i]) result=dp[i];
        }
        return result;

    }
    //取消dp数组
    public int maxSubArray1(int[] nums) {
        int pre=nums[0];
        int result=pre;
        for (int i = 1; i < nums.length; i++) {
            pre=Math.max(pre+nums[i],nums[i]);
            if (result<pre) result=pre;
        }
        return result;

    }
}
