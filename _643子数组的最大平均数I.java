import java.util.HashMap;

public class _643子数组的最大平均数I {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int n=nums.length;
        for (int i=0;i<k;i++){
            sum+=nums[i];
        }
        int maxSum=sum;
        for (int j=k;j<n;j++){
            sum=sum-nums[j-k]+nums[j];
            maxSum=Math.max(maxSum,sum);
        }
        return 1.0*maxSum/k;
    }
}
