import java.util.*;

public class _优势洗牌 {
    //类比田忌赛马，数组中最小值即下等马，最大值上等马
    //每次用nums1中的下等马去跟nums2中的下等马pk
    //如果干的过就干，干不过就用nums1中的下等马去当炮灰，去干nums2中的上等马
    //在本题中，如果干的过，就用nums2中的下等马的下标当做nums1中的下等马的下标
    //干不过，就用nums2中的上等马的下标当作nums1中的下等马的下标
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            List<Integer> list = map.getOrDefault(nums2[i], new ArrayList<>());
            list.add(i);
            map.put(nums2[i], list);
        }
        Arrays.sort(nums1); Arrays.sort(nums2);
        int[] ans = new int[n];
        //双指针
        for (int l1 = 0, l2 = 0, r2 = n - 1; l1 < n; l1++) {
            int t = nums1[l1] > nums2[l2] ? l2 : r2;
            List<Integer> list = map.get(nums2[t]);
            int idx = list.remove(list.size() - 1);
            ans[idx] = nums1[l1];
            if (t == l2) l2++;
            else r2--;
        }
        return ans;



    }
    public int[] advantageCount1(int[] nums1, int[] nums2){
        int n=nums1.length;
        HashMap<Integer, List<Integer>> hashMap = new HashMap<>();
        for (int i=0;i<n;i++){
            List<Integer> list = hashMap.getOrDefault(nums2[i], new ArrayList<>());
            list.add(i);
            hashMap.put(nums2[i],list);
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int []result=new int[n];
        for (int l1=0,l2=0,r2=n-1;l1<n;l1++){
            int t= nums1[l1]>nums2[l2]? l2:r2;
            List<Integer> list = hashMap.get(nums2[l2]);
            int resindex=list.remove(list.size()-1);
            result[resindex]=nums1[l1];
            if (t==l2) l2++;
            else r2--;
        }
        return result;
    }
}
