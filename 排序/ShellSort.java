package 排序;

public class ShellSort {
    public int [] sortArray(int[] nums){
        int len=nums.length;
        int currentValue,gap=len/2;
        while (gap>0){
            for (int i=gap;i<len;i++){
                currentValue=nums[i];
                //组内已被排序的索引
                int preIndex=i-gap;
                //在组内已被排序过数据中倒序寻找合适的位置，如果当前待排序数据比比较的元素药效则
                //将比较的元素在组内向后移动
                while (preIndex>=0&&nums[preIndex]>currentValue){
                    nums[preIndex+gap]=nums[preIndex];
                    preIndex-=gap;
                }
                nums[preIndex+gap]=currentValue;
            }
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
