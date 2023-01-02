package 链表;

public class _868链表的中间结点 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val=val;}
        ListNode(int val,ListNode next){this.val=val;this.next=next;}
    }
    public ListNode middleNode(ListNode head) {
        ListNode fastNode=head,slowNode=head;
        while (fastNode.next!=null&&fastNode.next.next!=null){
            fastNode=fastNode.next.next;
            slowNode=slowNode.next;
        }
        if (fastNode.next!=null){
            slowNode=slowNode.next;
        }
        return slowNode;
    }


}
