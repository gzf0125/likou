package 树;

public class _110平衡二叉树 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){this.val=val;}
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    public boolean isBalanced(TreeNode root) {
        if (root==null) return true;
        return hepler(root)!=-1;
    }

    private int hepler(TreeNode root){
        if (root==null) return 0;
        int  left=hepler(root.left);
        int right=hepler(root.right);
        if (left==-1||right==-1||Math.abs(left-right)>1){
            return -1;
        }
        return Math.max(left,right)+1;
    }
//递归
    class ReturnNode{

        boolean isB;
        int depth;
        public ReturnNode(boolean isB, int depth) {
            this.isB = isB;
            this.depth = depth;
        }
    }
    public boolean isBalanced1(TreeNode root) {
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
