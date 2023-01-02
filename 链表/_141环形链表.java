package 链表;

public class _141环形链表 {
    class ListNode{
        int var;
        ListNode next;
        ListNode(int x){
            var =x;
            next=null;
        }
    }
    public boolean hasCycle(ListNode head) {
        if (head==null){
            return false;
        }
        ListNode fastptr=head,slowptr=head;
        while (fastptr.next!=null&&fastptr.next.next!=null){
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
            if (slowptr==fastptr){
                return true;
            }
        }
        return false;

    }
}
