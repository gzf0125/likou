package 链表;

import com.sun.scenario.effect.impl.prism.PrReflectionPeer;
import org.junit.platform.commons.util.AnnotationUtils;

import java.util.List;

public class _206反转链表 {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){
            this.val=val;
        }
        ListNode(int val,ListNode next){
            this.val=val;
            this.next=next;
        }

    }
    //三指针迭代
    public static ListNode reverseList(ListNode head){
        if (head==null) return null;
        ListNode currentNode=head;
        ListNode preNode=null;
        while (currentNode!=null){
            ListNode next=currentNode.next;
            currentNode.next=preNode;
            preNode=currentNode;
            currentNode=next;
        }
        return  preNode;
    }
    //递归 以相似的方法重复，
    public static ListNode recursion(ListNode head){
        if (head==null || head.next==null) return head;
        ListNode newhead = recursion(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }

    public static void main(String[] args) {
        ListNode node5=new ListNode(5,null);
        ListNode node4=new ListNode(4,node5);
        ListNode node3=new ListNode(3,node4);
        ListNode node2=new ListNode(2,node3);
        ListNode node1=new ListNode(1,node2);
//        ListNode node = reverseList(node1);
        ListNode listNode = recursion(node1);
        System.out.println(listNode);
//        ListNode p=node;
//        while (p!=null){
//            System.out.println(p.val);
//            p=p.next;
//        }



    }
}
