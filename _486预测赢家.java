import 字符串.字符串匹配之KMP算法;

import java.util.Arrays;

public class _486预测赢家 {
    public boolean PredictTheWinner(int[] nums) {
        int length=nums.length;
        int dp[][]=new int[length][length];
        int sum=0;
        for (int i=0;i<length;i++){
            dp[i][i]=nums[i];
            sum+=nums[i];
        }
        for (int i=length-2;i>=0;i--){
            for (int j=i+1;j<length;j++){
                dp[i][j]=Math.max(nums[i]-dp[i+1][j],nums[j]-dp[i][j-1]);
            }
        }

        boolean result=dp[0][length-1]>=0 ? true:false;
        return result;
    }
}
