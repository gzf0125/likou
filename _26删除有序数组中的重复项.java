import java.util.List;

public class _26删除有序数组中的重复项 {
    class ListNode{
        int val;
        ListNode next;
        public ListNode() {
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public int removeDuplicates(int[] nums) {
        if (nums==null || nums.length==0){
            return 0;
        }
        int left=0;
        for (int right=1;right<nums.length;right++)
            if (nums[left]!=nums[right]){
                left++;
                nums[left]=nums[right];
            }
        return ++left;
    }
}
