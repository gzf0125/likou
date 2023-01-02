import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class _414第三大的数 {
    public int thirdMax(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int num : nums) {
            if (!res.contains(num)){
                res.add(num);
            }
        }
        if (nums.length<3){
            return res.get(res.size()-1);
        }
        else {
            return res.get(res.size()-3);
        }
    }
    public int thirdMax1(int[] nums){
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        for (int i=nums.length-1;i>=0;i--){
            if (!res.contains(nums[i])){
                res.add(nums[i]);
            }
            if (res.size()>3) break;
        }
        if (res.size()<3) return res.get(0);
        else return res.get(2);
    }
   //TreeSet有序集合
    public int thirdMax2(int[] nums){
        TreeSet<Integer> res = new TreeSet<>();
        for (int num : nums) {
            res.add(num);
            if (res.size()>3){
                res.remove(res.first());
            }
        }
        return res.size()==3 ? res.first():res.last();
    }
}
