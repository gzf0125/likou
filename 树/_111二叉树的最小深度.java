package 树;

import java.util.LinkedList;
import java.util.Queue;

public class _111二叉树的最小深度 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        int depth;//深度

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
    public int minDepth(_101对称二叉树.TreeNode root) {
        if (root==null) return 0;
        if (root.left==null && root.right!=null){
            return 1+minDepth(root.right);
        }
        if (root.right==null && root.left!=null){
            return 1+minDepth(root.left);
        }
        return 1+Math.min(minDepth(root.left),minDepth(root.right));
    }
    //深度优先 ，把叶子节点标为1，回溯回去
    public int minDepth1(TreeNode root) {
        if (root==null) return 0;
        if (root.left==null&&root.right==null) return 1;
        int min=Integer.MAX_VALUE;
        if (root.left!=null){
            min=Math.min(minDepth1(root.left),min);
        }
        if (root.right!=null){
            min=Math.min(minDepth1(root.right),min);
        }
        return min+1;


    }
    //广度优先，把根节点标为1，向下找，一层层寻找
    public int minDepth3(TreeNode root) {
        if (root==null) return 0;
        Queue<TreeNode> queue=new LinkedList<TreeNode>();//用链表当队列，实现先进先出
        root.depth=1;
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if (node.left==null && node.right==null) {
                return node.depth;
            }
            if (node.left!=null){
                node.left.depth=node.depth+1;
                queue.offer(node.left);
            }
            if (node.right!=null){
                node.right.depth=node.depth+1;
                queue.offer(node.right);
            }
                    }
        return 0;

    }
    public class QueueNode{
        TreeNode node;
        int depth;//当前节点深度

        public QueueNode() {
        }

        public QueueNode(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }
    public int minDepth4(TreeNode root){
        if (root==null) return 0;
        Queue<QueueNode> queue=new LinkedList<QueueNode>();
        queue.offer(new QueueNode(root,1));
        while (!queue.isEmpty()){
            QueueNode curnode = queue.poll();
            if (curnode.node.left==null&&curnode.node.right==null){
                return curnode.depth;
            }
            if (curnode.node.left!=null){
                queue.offer(new QueueNode(curnode.node.left,curnode.depth+1));
            }
            if (curnode.node.right!=null){
                queue.offer(new QueueNode(curnode.node.right,curnode.depth+1));
            }
        }
        return 0;
    }



}
