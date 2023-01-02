package 树;

public class _530二叉搜索树的最小绝对差 {
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
    int pre;
    int ans;
    public int getMinimumDifference(TreeNode root) {
        ans=Integer.MAX_VALUE;
        pre=-1;
        dfs(root);
        return ans;
    }
    private void dfs(TreeNode root){
        if (root==null) return;
        dfs(root.left);
        if (pre==-1){
            pre=root.val;
        }else {
            ans=Math.min(ans,root.val-pre);
            pre=root.val;
        }
        dfs(root.right);
    }
}
