import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _219存在重复元素 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, List<Integer>> hashMap = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (!hashMap.containsKey(nums[i])){
                hashMap.put(nums[i],new ArrayList<>());
                hashMap.get(nums[i]).add(i);
            }else {
                hashMap.get(nums[i]).add(i);
                int size=hashMap.get(nums[i]).size()-1;
                if ((hashMap.get(nums[i]).get(size)-hashMap.get(nums[i]).get(size-1))<=k) return true;
            }
        }
        return false;
    }
    public boolean containsNearbyDuplicate1(int[] nums, int k){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int num=nums[i];
            if (!hashMap.containsKey(num)){
                hashMap.put(num,i);
            }else if (i-hashMap.get(num)<=k){
                return true;
            }
            hashMap.put(num,i);
        }
        return false;
    }
}
