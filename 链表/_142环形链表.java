package 链表;

public class _142环形链表 {
    class ListNode{
        int var;
        ListNode next;
        ListNode(int x){
            var=x;
            next=null;
        }
    }
    public ListNode detectCycle(ListNode head) {
        if (head==null) return null;
        ListNode slowptr=head,fastptr=head;
        boolean isExists=false;
        while (fastptr.next!=null && fastptr.next.next!=null){
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
            if (slowptr==fastptr){
                //环存在
                isExists=true;
                break;
            }
        }
        if (isExists){
            slowptr=head;
            while (slowptr!=fastptr){
                fastptr=fastptr.next;
                slowptr=slowptr.next;
            }
            return slowptr;
        }
        return null;
    }
}
