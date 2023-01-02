import java.util.LinkedList;
import java.util.Queue;

public class _404左叶子之和 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode() {
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    //深度优先
    public int sumOfLeftLeaves(TreeNode root) {
        return root != null ? dfs(root) : 0;
    }
    private int dfs(TreeNode root){
        int ans=0;
        if (root.left!=null){
            ans+=isLeafNode(root.left) ? root.left.val:dfs(root.left);
        }
        if (root.right!=null&&!isLeafNode(root.right)){
            ans+=dfs(root.right);
        }
        return ans;
    }
    private boolean isLeafNode(TreeNode root){
        if (root.left==null&&root.right==null) return true;
        else return false;
    }

    //广度优先
    public int sumOfLeftLeaves1(TreeNode root){
        if (root==null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int ans=0;
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if (node.left!=null){
                if (isLeafNode(node.left)){
                    ans+=node.left.val;
                }else {
                    queue.offer(node.left);
                }
            }
            if (node.right!=null){
                if (!isLeafNode(node.right)){
                    queue.offer(node.right);
                }
            }

        }
        return ans;
    }


}
