import java.util.HashMap;
import java.util.Map;

public class _006两数之和 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
        int []result=new int[2];
        for (int i = 0; i <nums.length ; i++) {
            int another=target-nums[i];
            Integer anotherindex=hashMap.get(another);
            if (anotherindex!=null){
                result[0]=anotherindex;
                result[1]=i;
                break;
            }else {
                hashMap.put(nums[i],i);
            }
        }

        return result;
    }
}
