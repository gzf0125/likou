import java.util.*;

public class _496下一个更大元素 {
    //暴力
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> num = new ArrayList<Integer>();
        int []res =new  int[nums1.length];
        int max=0;
        for (int i : nums2) {
            max=Math.max(i,max);
            num.add(i);
        }
        for (int i=0;i<nums1.length;i++){
            int index=num.indexOf(nums1[i]);
            if (index==nums2.length-1) res[i]=-1;
            if (nums2[index]==max) res[i]=-1;
            for (int k=index+1;k<nums2.length;k++){
                if (nums2[index]<nums2[k]) {
                    res[i] = nums2[k];
                    break;
                }else {
                    if (k==nums2.length-1) res[i]=-1;
                }

            }
        }
        return res;
    }
    //单调栈加哈希表
    public int[] nextGreaterElement1(int[] nums1, int[] nums2){
        HashMap <Integer,Integer>res = new HashMap();
        Stack<Integer> stack = new Stack<>();
        int []resullt=new int[nums1.length];
        for (int i=nums2.length-1;i>=0;i--){
            int num=nums2[i];
            while (!stack.isEmpty()&&num>=stack.peek()){
                stack.pop();
            }
            res.put(num,stack.isEmpty()? -1:stack.peek());
            stack.push(num);
        }
        for (int i=0;i<nums1.length;i++){
            resullt[i]=res.get(nums1[i]);
        }
        return resullt;
    }
}
