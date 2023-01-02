import java.util.HashMap;

public class _217存在重复元素 {
    //HashMap
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            if (!hashMap.containsKey(num)) {
                hashMap.put(num,num);
            }else {
                return true;
            }
        }
        return false;
    }
    //
    public boolean containsDuplicate1(int[] nums){
        int count=0;
        Integer candidate=null;
        for (int num : nums) {
            if (count>0) return true;
            if (count==0) candidate=num;
            else count+=(candidate==num) ? 1:-1;
        }
        return false;
    }
}
