package 树;

public class _543二叉树的直径 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode(int val) {
            this.val = val;
        }
    }
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
return 0;
    }
    private int depth(TreeNode root){
        if (root==null) return 0;
        int left=depth(root.left);
        int right=depth(root.right);
        int sum=left+right;
        max=Math.max(sum,max);
        return Math.max(left,right)+1;
    }

    public static void main(String[] args) {
        
    }
}
