import java.util.ArrayList;
import java.util.List;

public class _228汇总区间 {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int i=0;
        int n=nums.length;
        while (i<n){
            int low=i;
            i++;
            while (i<n&&nums[i]==nums[i-1]+1){
                i++;
            }
            int high=i-1;
            StringBuilder SB = new StringBuilder(Integer.toString(nums[low]));
            if (low<high){
                SB.append("->");
                SB.append(Integer.toString(nums[high]));
            }
            result.add(SB.toString());


        }
        return result;
    }

}
