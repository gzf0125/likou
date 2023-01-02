import java.util.Arrays;
import java.util.HashMap;

public class _169多数元素 {
    //hashmap
    public int majorityElement(int[] nums) {
        int result=0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int flag=nums.length>>1;
        for (int num : nums) {
            int count=hashMap.getOrDefault(num,0);
            hashMap.put(num,count+1);
        }


        for (Integer integer : hashMap.keySet()) {
            if (hashMap.get(integer)>flag) result=integer;
        }


        return result;
    }
    public int majorityElement1(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length>>1];
    }
    //摩尔算法
    public int majorityElement2(int[] nums){
        int count=0;
        Integer candidate=null;
        for (int num : nums) {
            if (count==0){
                candidate=num;
            }
            count+=(num==candidate)? 1:-1;
        }
        return candidate;
    }
    //分治
    public int majorityElement3(int[] nums){
        return helper(nums,0,nums.length-1);
    }
    private int countInRange(int []nums,int num,int left,int right){
        int count=0;
        for (int i : nums) {
            if (i==num) count++;
        }
        return count;
    }
    private int helper(int []nums,int left,int right){
        if (left==right) return nums[left];
        int mid=left+(right-left)>>1;//中间偏左
        int lef=helper(nums,left,mid);
        int rig=helper(nums,mid+1,right);
        if (lef==rig) return lef;
        int leftCount=countInRange(nums,lef,left,right);
        int rightCount=countInRange(nums,rig,left,right);
        return leftCount>rightCount ? lef:rig;
    }



}
