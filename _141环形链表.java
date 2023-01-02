import java.util.HashMap;

public class _141环形链表 {
    public class ListNode{
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    //哈希表
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Integer> hashMap = new HashMap<>();
        while (head!=null){
            if (!hashMap.containsKey(head)){
                hashMap.put(head,head.val);
            }else return true;
            head=head.next;
        }
        return false;
    }
    //快慢指针
    public boolean hasCycle1(ListNode head) {
        if (head==null||head.next==null) return false;
        ListNode fast,slow;
        fast=head.next;
        slow=head;
        while (fast!=slow){
            if (fast==null || fast.next==null) return false;
            fast=fast.next.next;
            slow=slow.next;
        }
        return true;
    }
}
