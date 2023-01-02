package 排序;

public class BubbleSort {
    public static int[] sortArray(int [] nums){
        if (nums.length==0) return nums;
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length-1-i;j++){
                if (nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }

            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println("-------------");
        int [] array={1,4,2,3,5,56,3,4,54,23,45};
        int[] ints = sortArray(array);
        for (int anInt : ints) {
            System.out.print(anInt);
        }

    }
}
