package 链表;

import java.util.ArrayList;

public class _234回文链表 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val=val;}
        ListNode(int val,ListNode next){this.next=next;}
    }
    public boolean isPalindrome(ListNode head) {
        ListNode fastNode=head,slowNode=head;
        while (fastNode!=null && fastNode.next!=null){
            fastNode=fastNode.next.next;
            slowNode=slowNode.next;
        }
        //如果链表为奇数个结点，把正中的归在左边
        if (fastNode!=null){
            slowNode=slowNode.next;
        }
        slowNode=reverse(slowNode);
        fastNode=head;
        while (slowNode!=null){
            if (fastNode.val!=slowNode.val){
                return false;
            }
            fastNode=fastNode.next;
            slowNode=slowNode.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode preNode=null;
        while (head!=null){
            ListNode next=head.next;
            head.next=preNode;
            preNode=head;
            head=next;
        }
        return preNode;
    }

}
