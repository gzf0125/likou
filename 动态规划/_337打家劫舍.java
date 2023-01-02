package 动态规划;

public class _337打家劫舍 {
    public class TreeNode{
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
    public int rob(TreeNode root) {
        int result[]=dfs(root);
        return Math.max(result[0],result[1]);
    }
    public int[] dfs(TreeNode root){//[0]表示选择该节点最大权值，[1]表示不选择该节点最大权值
        if (root==null) return new int[]{0,0};
        int []left=dfs(root.left);
        int []right=dfs(root.right);
        int selected=root.val+left[1]+right[1];
        int notSelected=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        return new int[]{selected,notSelected};
    }
}
