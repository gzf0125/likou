package 树;

import java.util.LinkedList;
import java.util.Queue;

public class _104二叉树的最大深度 {
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
    //递归
    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }else {
            return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
        }
    }
    public int maxDepth1(TreeNode root){
        if (root==null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth=0;
        while (!queue.isEmpty()){
            //size用来记录本层级的结点是否已经处理完
            int size=queue.size();
            while (size>0){
                TreeNode node=queue.poll();
                if (node.left!=null){
                    queue.offer(node.left);
                }
                if (node.right!=null){
                    queue.offer(node.right);
                }
                size--;
            }
            depth++;
        }
        return depth;

    }
}
