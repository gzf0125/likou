import javax.naming.PartialResultException;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;

public class _268丢失的数字 {
    public int missingNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            hashMap.put(nums[i],nums[i]);
            if (hashMap.get(nums[i])!=i) return i;
        }
        return nums.length;
    }
    public int missingNumber1(int[] nums){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            hashMap.put(nums[i],i);
        }
        for (int i=0;i<nums.length;i++){
            if (!hashMap.containsKey(i)){
                return i;
            }
        }
        return nums.length;
    }
    //按位异或
    public int missingNumber2(int[] nums){
        int xor=0;
        for (int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        for (int i=0;i<=nums.length;i++){
            xor^=i;
        }
        return xor;
    }


}
