package 排序;

public class ChoiceSort {
    public int[] sortArray(int[] nums){
        if (nums.length==0){
            return nums;
        }
        for (int i=0;i<nums.length;i++){
            int mindex=i;
            for (int j=i;j<nums.length;j++){
                if (nums[j]< nums[mindex]){
                    mindex=j;
                }
            }
            int temp=nums[mindex];
            nums[mindex]=nums[i];
            nums[i]=temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int [] a={21,12,34,23,11,33,54,67,98,34};
        int[] array = new ChoiceSort().sortArray(a);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
