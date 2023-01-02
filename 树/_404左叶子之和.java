package 树;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class _404左叶子之和 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public int sumOfLeftLeaves1(TreeNode root) {
        return dfs(root);
    }
    private int dfs(TreeNode root){
        int sum=0;
        if (root.left!=null){
            sum+=isleaveNode(root.left)? root.left.val:dfs(root.left);
        }
        if (root.right!=null&&!isleaveNode(root.right)){
            sum+=dfs(root.right);
        }
        return sum;
    }
    private boolean isleaveNode(TreeNode root){//判断是否为叶子节点
        if (root.left==null&&root.right==null){
            return true;
        }else return false;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if (root==null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int sum=0;
        while (!queue.isEmpty()){
            TreeNode nownode = queue.poll();
            if (nownode.left!=null){
                if (isleaveNode(nownode.left)){
                    sum+=nownode.left.val;
                }else {
                    queue.offer(nownode.left);
                }
            }
            if (nownode.right!=null){
               if (!isleaveNode(nownode.right)){
                   queue.offer(nownode.right);
               }
            }
        }
        return sum;

    }
}
