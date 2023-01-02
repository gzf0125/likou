public class _002两数相加 {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int carry=0;//进位
            ListNode result=new ListNode(0);//创建一个新链表，表头初始化为0
            ListNode cur=result;
            while (l1!=null || l2!=null){
                int x=l1==null ? 0:l1.val;
                int y=l2==null ? 0:l2.val;
                int sum=x+y+carry;
                carry=sum/10;
                sum=sum%10;
                cur.next=new ListNode(sum);
                cur=cur.next;
                if (l1!=null) l1=l1.next;
                if (l2!=null) l2=l2.next;
            }
            if (carry==1) cur.next=new ListNode(carry);
            return result.next;
        }


}
