import java.util.HashMap;

public class _35搜索插入位置 {
    public int searchInsert(int[] nums, int target) {
        if (nums.length==0||nums==null) return 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==target) return i;
            if (nums[i]>target) return i;
        }
        return nums.length;

    }
    //二分法
    public int searchInsert1(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + right >> 1;
            if (nums[mid] < target) left = mid + 1;    // 只需找到第一个 >=target 的位置
            else right = mid;
        }
        return left;


    }
    public int searchInsert2(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while (left<right){
            int mid=(left+right)>>1;
            if (target>nums[mid]) left=mid+1;
            else if (target<nums[mid]) right=mid;
            else return mid;
        }
        return left;


    }



}
