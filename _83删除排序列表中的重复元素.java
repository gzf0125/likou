public class _83删除排序列表中的重复元素 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null){
            return head;
        }
        ListNode currentNode=head;
        while (currentNode.next!=null){
            if (currentNode.next.val==currentNode.val){
                currentNode.next=currentNode.next.next;
            }else {
                currentNode=currentNode.next;
            }
        }
        return head;
    }
    public ListNode deleteDuplicates1(ListNode head) {
        if (head==null || head.next==null){
            return head;
        }
        head.next=deleteDuplicates1(head.next);
        return head.val==head.next.val? head.next : head;

    }
    public ListNode deleteDuplicates2(ListNode head) {
        if (head==null || head.next==null)return head;
        head.next=deleteDuplicates(head.next);
        return head.val==head.next.val? head.next :head;
    }
}
