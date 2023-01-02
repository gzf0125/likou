package 排序;

public class QuickSort {
    public int[] sortArray(int[] nums){
         return sort(nums,0,nums.length-1);
         }

    public static int[] sort(int[]array,int start,int end){
        if (array.length<1 || start<0 || end>=array.length || start>end) {
            return null;
        }
        //数据分成独立的两部分时，从哪儿分区的指示器
        int zoneIndex=partition(array,start,end);
        if (zoneIndex>start){
            sort(array,start,zoneIndex-1);
        }
        if (zoneIndex<end){
            sort(array,zoneIndex+1,end);
        }
        return array;
}
    public static int partition(int[] array,int start,int end){
        if (start==end) return start;
        //随机选取一个基准数
        int pivot=(int)(start+Math.random()*(end-start+1));
        //zoneIndex是分区指示器
        int zoneIndex=start-1;
        swap(array,pivot,end);
        for (int i=start;i<=end;i++){
            if (array[i]<=array[end]){
                zoneIndex++;
                if (i>zoneIndex)
                    swap(array,i,zoneIndex);
            }
        }
        return zoneIndex;

    }
    public static void swap(int[]array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    public static void main(String[] args) {
        int array[]={21,12,34,23,11,33,54,67,98,34};
        int[] sortArray = new QuickSort().sortArray(array);
        for (int i : sortArray) {
            System.out.println(i);
        }
    }
}