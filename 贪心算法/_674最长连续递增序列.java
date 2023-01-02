package 贪心算法;

public class _674最长连续递增序列 {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==1) return nums[0];
        int start=0;
        int max=0;
        for (int i=1;i<nums.length;i++){
            if (nums[i]<=nums[i-1] ){
                start=i;
            }
            max=Math.max(i-start+1,max);
        }
        return max;



    }
}
