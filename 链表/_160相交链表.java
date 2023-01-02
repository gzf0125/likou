package 链表;

public class _160相交链表 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
            next=null;
        }
    }
    //双指针
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null|| headB==null){
            return null;
        }
        ListNode pA=headA;
        ListNode pB=headB;
        while (pA!=pB){
            pA=pA==null ? headB : pA.next;
            pB=pB==null ? headA : pB.next;
        }
        return pA;
    }
    //让一指针先移动，直至两链表长度相同
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        int L1=0,L2=0;
        int diff=0;
        if (headA==null|| headB==null){
            return null;
        }
        ListNode pA=headA,pB=headB;
        while (pA!=null){
            L1++;
            pA=pA.next;
        }
        while (pB!=null){
            L2++;
            pB=pB.next;
        }
        if (L1<L2){
            pA=headB;
            pB=headA;
            diff=L2-L1;
        }else {
            pA=headA;
            pB=headB;
            diff=L1-L2;
        }
        for (int i=0;i<diff;i++){
            pA=pA.next;
        }
        while (pA!=null&&pB!=null){
            if (pA==pB){
                return pA;
            }
            pA= pA.next;
            pB=pB.next;
        }
        return null;

    }
}
