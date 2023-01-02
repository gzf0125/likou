package 链表;

import java.util.Arrays;
import java.util.HashMap;

public class _167两数之和II输入有序数组 {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int []result=new int[2];
        for (int i=0;i<numbers.length;i++){
            if (!hashMap.containsKey(numbers[i])){
                hashMap.put(numbers[i],i);
            }
        }
        for (int j=0;j<numbers.length;j++){
            if (hashMap.containsKey(target-numbers[j])){
                result[0]=j+1;
                result[1]=hashMap.get(target-numbers[j])+1;
            }
        }
        Arrays.sort(result);
        return result;
    }
    public int[] twoSum1(int[] numbers, int target) {
        int start=0,end=numbers.length-1;
        while (start<end){
            int sum=numbers[start]+numbers[end];
            if (sum==target) return new int[]{start+1,end+1};
            else if (target<sum){
                end--;
            }else if (target>sum){
                start++;
            }
        }
        return null;

    }
}
