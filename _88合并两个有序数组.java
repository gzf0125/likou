public class _88合并两个有序数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=m+n;
        int []temp=new int[k];
        for (int index = 0,nums1index=0,nums2index=0; index < k; index++) {
            if (nums1index>=m){
                temp[index]=nums2[nums2index++];
            }
            else if (nums2index>=n){
                temp[index]=nums1[nums1index++];
            }else if (nums1[nums1index]<=nums2[nums2index]){
                temp[index]=nums1[nums1index++];
            }else{
                temp[index]=nums2[nums2index++];
            }
        }
        for (int i = 0; i <k ; i++) {
            nums1[i]=temp[i];
        }
    }
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        int k=m+n;
        for (int nums1index=m-1,nums2index=n-1,index=k-1;index>=0;index--){
            if (nums1index<0){
                nums1[index]=nums2[nums2index--];
            }else if (nums2index<0){
                break;
            }else if (nums1[nums1index]>nums2[nums2index]){
                nums1[index]=nums1[nums1index--];
            }else {
                nums1[index]=nums2[nums2index--];
            }
        }

    }
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1;
        int p2=n-1;
        int tail=m+n-1;
        while (p1>=0 || p2>=0){
            if (p1==-1) nums1[tail--]=nums2[p2--];
            else if (p2==-1) nums1[tail--]=nums1[p1--];
            else if (nums1[p1]<nums2[p2]) nums1[tail--]=nums2[p2--];
            else nums1[tail--]=nums1[p1--];
        }
    }
    public static void main(String[] args) {
        int []nums1= {1, 5, 8, 0, 0, 0};
        int []nums2={2,4,7};
        int m=3;
        int n=3;
        merge1(nums1,m,nums2,n);




    }
}
