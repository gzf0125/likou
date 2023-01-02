import java.util.LinkedList;
import java.util.Queue;

public class _112路径总和 {
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root==null){
            return false;
        }
        Queue<TreeNode> queNode = new LinkedList<>();
        Queue<Integer> queVal = new LinkedList<>();
        queNode.offer(root);
        queVal.offer(root.val);
        while (!queNode.isEmpty()){
            TreeNode now = queNode.poll();
            int temp=queVal.poll();
            if (now.left==null&&now.right==null){
                if (temp==targetSum)return true;
                continue;
            }
            if (now.left!=null){
                queNode.offer(now.left);
                queVal.offer(now.left.val+temp);
            }
            if (now.right!=null){
                queNode.offer(now.right);
                queVal.offer(now.right.val+temp);
            }

        }
        return false;
    }

}
