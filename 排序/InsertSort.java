package 排序;

public class InsertSort {
    public int[] sortArray(int [] nums){
        if (nums.length==0) return nums;
        int currentValue;//当前待排序数据，该元素之前的元素均已被排序过
        for (int i=0;i<nums.length-1;i++){
            int preIndex=i;//已被排序的索引
            currentValue=nums[preIndex+1];
            while (preIndex>=0&&currentValue<nums[preIndex]){
                nums[preIndex+1]=nums[preIndex];
                preIndex--;
            }
            nums[preIndex+1]=currentValue;
        }
        return nums;
    }

    public static void main(String[] args) {
        int array[]={21,12,34,23,11,33,54,67,98,34};
        int[] sortArray = new InsertSort().sortArray(array);
        for (int i : sortArray) {
            System.out.println(i);
        }
    }
}
