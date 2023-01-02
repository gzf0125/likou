import java.util.LinkedList;
import java.util.Queue;

public class _100相同的树 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode() {
        }
    }
    //广度优先
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null&&q==null) return true;
        else if (p==null||q==null) return false;
        else if (p.val!=q.val) return false;
        else {
            return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }

    }
    //深度优先
    public boolean isSameTree1(TreeNode p, TreeNode q){
        Queue<TreeNode> queues = new LinkedList<>();
        queues.offer(p);
        queues.offer(q);
        while (!queues.isEmpty()){
            p=queues.poll();
            q=queues.poll();
            if (p==null&&q==null) continue;
            if (p==null||q==null) return false;
            if (p.val!=q.val) return false;
            queues.offer(p.left);
            queues.offer(q.left);
            queues.offer(p.right);
            queues.offer(q.right);
        }
        return true;
    }
}
