import java.util.ArrayList;
import java.util.List;

public class _485最大连续1的个数 {
    public int findMaxConsecutiveOnes(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int count=0;
        int max=0;
        for (int num : nums) {
            if (num==1){
                count++;
            }else {
                max=Math.max(count,max);
                count=0;
            }
        }
        max=Math.max(count,max);
        return max;
    }
}
