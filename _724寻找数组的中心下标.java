import java.util.Arrays;

public class _724寻找数组的中心下标 {
    public int pivotIndex(int[] nums) {
        int sum=0,left_sum=0;//sum=left_sum*2+nums[result]
//        sum=Arrays.stream(nums).sum();
        for (int i=0;i<nums.length;i++){
            sum=sum+nums[i];//求全部元素的和
        }
        for (int result=0;result<nums.length;result++){
            if (left_sum==(sum-nums[result]-left_sum))return result;
            left_sum+=nums[result];
        }
        return -1;
    }
}
