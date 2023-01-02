public class _704二分查找 {
    //二分查找
    public int search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if (target>nums[mid]){
                start=mid+1;
                mid=(start+end)/2;
            }else if (target<nums[mid]){
                end=mid-1;
                mid=(start+end)/2;
            }else{
                return mid;
            }
        }return -1;

    }
    //递归
    public int search1(int[] nums, int target) {
        return searchNum(nums,0,nums.length-1,target);
    }
    private int searchNum(int []arr,int start,int end,int target) {
        int mid=(start+end)/2;
        if (start<=end){
            if (target>arr[mid]){
                return searchNum(arr,mid+1,end,target);
            }else if (target<arr[mid]){
                return searchNum(arr,start,end-1,target);
            }else return mid;
        }else {
            return -1;
        }
    }

}
