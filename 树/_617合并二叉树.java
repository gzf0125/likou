package 树;

import sun.reflect.generics.tree.Tree;

public class _617合并二叉树 {
    public class  TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
       if (root1==null) return root2;
       if (root2==null) return root1;
       TreeNode merged = new TreeNode(root1.val + root2.val);
       merged.left=mergeTrees(root1.left,root2.left);
       merged.right=mergeTrees(root1.right,root2.right);
       return merged;
    }


}
