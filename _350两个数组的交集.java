import java.util.*;

public class _350两个数组的交集 {
    //哈希表
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        if (nums1.length<=nums2.length){
            for (int i : nums1) {
                if (!hashMap.containsKey(i)){
                    hashMap.put(i,1);
                }else {
                    hashMap.put(i,hashMap.get(i)+1);
                }
            }
            for (int i : nums2) {
                if (hashMap.containsKey(i)){
                    if (hashMap.get(i)>0){
                        res.add(i);
                        hashMap.put(i,hashMap.get(i)-1);
                    }
                }
            }
        }else {
            for (int i : nums2) {
                if (!hashMap.containsKey(i)){
                    hashMap.put(i,1);
                }else {
                    hashMap.put(i,hashMap.get(i)+1);
                }
            }
            for (int i : nums1) {
                if (hashMap.containsKey(i)){
                    if (hashMap.get(i)>0){
                        res.add(i);
                        hashMap.put(i,hashMap.get(i)-1);
                    }
                }
            }
        }
        int []result=new int[res.size()];
        for (int i=0;i<res.size();i++){
            result[i]=res.get(i);
        }
        return result;


    }
    //排序+双指针
    public int[] intersect1(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> res = new ArrayList<>();
        int n1=nums1.length,n2=nums2.length;
        for (int p1=0,p2=0;p1<n1&&p2<n2;){
            if (nums1[p1]==nums2[p2]){
                res.add(nums1[p1]);
                p1++;
                p2++;
            }else if (nums1[p1]<nums2[p2]){
                p1++;
            }else p2++;
        }
        int []n=new int[res.size()];
        for (int i=0;i<res.size();i++){
            n[i]=res.get(i);
        }
        return n;

    }
}
