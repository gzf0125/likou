package 动态规划;

public class _213打家劫舍 {
    public int rob(int[] nums) {
        if (nums==null || nums.length==0) return 0;
        int length=nums.length;
        if (length==1) return nums[0];
        if (length==2) return Math.max(nums[0],nums[1]);


        return Math.max(myrob(nums,0,length-2),myrob(nums,1,length-1));
        }

    public int myrob(int []nums,int start,int end){
        int first,second;
        first=nums[start];
        second=Math.max(nums[start],nums[start+1]);
        for (int i=start+2;i<=end;i++){
            int temp=second;
            second=Math.max(first+nums[i],second);
            first=temp;
        }
        return second;

    }
    }

