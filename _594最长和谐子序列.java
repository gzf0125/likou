import java.util.*;

public class _594最长和谐子序列 {
    //哈希表
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            hashMap.put(num,hashMap.getOrDefault(num,0)+1);
        }
        int max=0;
        for (int num : nums) {
            int count=0;
            if (hashMap.containsKey(num+1)){
                count=hashMap.get(num)+hashMap.get(num+1);
            }
            max=Math.max(max,count);
        }
        return max;
    }
    //排序
    public int findLHS1(int[] nums){
        Arrays.sort(nums);
        int max=0;
        for (int i=0;i< nums.length;i++){
            int count=0;
            boolean flag=false;
            for (int j=i+1;j<nums.length;j++){
                if (nums[j]-nums[i]==1){
                    count++;
                    flag=true;

                }else if (nums[j]==nums[i]){
                    count++;
                }
            }
            if (flag==false) count=0;
            else count++;
            max=Math.max(max,count);
        }
        return max;
    }
}
