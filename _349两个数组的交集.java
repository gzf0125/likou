import java.util.*;

public class _349两个数组的交集 {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : nums1) {
            if (!hashMap.containsKey(i)){
                hashMap.put(i,1);
            }
        }
        for (int i : nums2) {
            if (hashMap.containsKey(i)){
                if (!res.contains(i)){
                    res.add(i);
                }
            }
        }
        int result[]=new int[res.size()];
        for (int i=0;i<res.size();i++){
            result[i]=res.get(i);
        }
        return result;
    }
    public int[] intersection1(int[] nums1, int[] nums2){
        HashSet<Integer> num1 = new HashSet<>();
        HashSet<Integer> num2 = new HashSet<>();
        for (int i : nums1) {
            num1.add(i);
        }
        for (int i : nums2) {
            num2.add(i);
        }
        int n1=num1.size();
        int n2=num2.size();
        List<Integer> res = new ArrayList<>();
        if (n1>=n2){
            for (Integer integer : num2) {
                if (num1.contains(integer)){
                    res.add(integer);
                }
            }
        }else {
            for (Integer integer : num1) {
                if (num2.contains(integer)){
                    res.add(integer);
                }
            }
        }
        int []result=new int[res.size()];
        for (int i=0;i<res.size();i++){
            result[i]=res.get(i);
        }
        return result;
    }
}
