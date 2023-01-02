import org.junit.jupiter.api.Test;

public class _110平衡二叉树 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {}
        public TreeNode(int val) {this.val=val;}
        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class ReturnNode{

        boolean isB;
        int depth;
        public ReturnNode(boolean isB, int depth) {
            this.isB = isB;
            this.depth = depth;
        }
    }
    public boolean isBalanced(TreeNode root) {
        return isBSTree(root).isB;
    }
    public ReturnNode isBSTree(TreeNode root){
        if (root==null) return new ReturnNode(true,0);
        ReturnNode left = isBSTree(root.left);
        ReturnNode right = isBSTree(root.right);
        if (left.isB==false||right.isB==false){
            return new ReturnNode(false,0);
        }
        if (Math.abs(left.depth-right.depth)>1){
            return new ReturnNode(false,0);
        }
        return new ReturnNode(true,Math.max(left.depth,right.depth)+1);


    }

}
