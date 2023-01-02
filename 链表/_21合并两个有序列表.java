package 链表;

public class _21合并两个有序列表 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1==null) return list2;
        if (list2==null) return list1;
        ListNode resultNode = new ListNode(0);
        ListNode p=resultNode;
        while(list1!=null&&list2!=null){
            if (list1.val<list2.val){
                p.next=list1;
                list1=list1.next;
            }else {
                p.next=list2;
                list2=list2.next;
            }
            p=p.next;
        }
        if (list1!=null){
            p.next=list1;
        }
        if (list2!=null){
            p.next=list2;
        }
        return resultNode.next;
    }
    //递归
    public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        if (list1==null) return list2;
        if (list2==null) return list1;
        if (list1.val<list2.val){
            list1.next=mergeTwoLists1(list1.next,list2);
            return list1;
        }
        list2.next=mergeTwoLists1(list1,list2.next);
        return list2;
    }
    public class ListNode {
        int val;//数据域
        ListNode next;//指针域
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    //迭代
    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        ListNode resultNode=new ListNode(0);
        ListNode p=resultNode;
        if (list1==null)return list2;
        if (list2==null)return list1;
        while (list1!=null&&list2!=null){
            if (list1.val<list2.val){
                p.next=list1;
                list1=list1.next;
                p=p.next;
            }else {
                p.next=list2;
                list2=list2.next;
                p=p.next;
            }
        }
        if (list1!=null) p.next=list1;
        if (list2!=null) p.next=list2;
        return resultNode.next;

    }
    //递归
    public ListNode mergeTwoLists3(ListNode list1, ListNode list2) {
        if (list1==null)return list2;
        if (list2==null)return list1;
        if (list1.val<list2.val) {
            list1.next=mergeTwoLists3(list1.next,list2);
            return list1;
        }else {
        list2.next=mergeTwoLists3(list1,list2.next);
        return list2;
        }
    }

        }

