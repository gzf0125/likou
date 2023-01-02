package 树;

import java.util.LinkedList;
import java.util.Queue;

public class _101对称二叉树 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val) {this.val=val;}
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    //递归
    public boolean isSymmetric(TreeNode root) {
        if (root==null){
            return true;
        }
        //调用递归函数，比较左节点、右节点
        return deepCheck(root.left,root.right);
    }
    boolean deepCheck(TreeNode left,TreeNode right){
        //递归的终止条件是两个节点都为空
        //或者两个节点中有一个为空
        //或者两个节点的值都不相等
        if (left==null&&right==null){
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val!=right.val){
            return false;
        }
        //再递归的比较 左节点的左孩子 和 右节点的右孩子
        //以及比较 左节点的右孩子和右节点的左孩子
        return deepCheck(left.left,right.right) && deepCheck(left.right,right.left);

    }
    public boolean isSymmetric1(TreeNode root){
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        TreeNode u=root.left;
        TreeNode v=root.right;
        if (root==null || (u==null && v==null)){
            return true;
        }
        q.offer(u);
        q.offer(v);
        while (!q.isEmpty()){
            u=q.poll();
            v=q.poll();
            if (u==null&&v==null){
                continue;
            }
            if ((u==null || v==null) || (u.val!=v.val)){
                return false;
            }
            q.offer(u.left);
            q.offer(v.right);

            q.offer(u.right);
            q.offer(v.left);

        }
        return true;
    }
    //递归2

    public boolean isSymmetric2(TreeNode root) {
        if (root==null) return true;
        return isSm(root.left,root.right);
    }
    boolean isSm(TreeNode node1,TreeNode node2){
        if (node1==null && node2==null) return true;
        if (node1==null || node2==null || node1.val!=node2.val) return false;
        return isSm(node1.left, node2.right)&&isSm(node1.right,node2.left);

    }

}
