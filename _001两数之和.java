import java.util.HashMap;

public class _001两数之和 {
    public int[] twoSum(int[] nums, int target) {
        int result[]=new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i=0;i<nums.length;i++){
            int right=target-nums[i];
            Integer rightindex = hashMap.get(right);
            if (rightindex!=null){
                result [0]=i;
                result [1]=rightindex;
                break;
            }else {
                hashMap.put(nums[i],i);
            }
        }
        return result;
    }
}
