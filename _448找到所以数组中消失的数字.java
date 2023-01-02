import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _448找到所以数组中消失的数字 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int num : nums) {
            int x=(num-1)%nums.length;//对n取模还原原本的值
            nums[x]+=nums.length;
        }
        int count=0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<=nums.length){
                list.add(i+1);
            }
        }
        return list;
    }
}
