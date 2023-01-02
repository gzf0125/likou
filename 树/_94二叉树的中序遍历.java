package 树;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _94二叉树的中序遍历 {
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        accessTree(root,res);
        return res;
    }
    public void accessTree(TreeNode root,List<Integer> res){
        if (root==null) return;
        accessTree(root.left,res);
        res.add(root.val);
        accessTree(root.right,res);
    }

    //栈
    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (root!=null || !stack.isEmpty()){
            while (root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            res.add(root.val);
            root=root.right;
        }
        return res;
    }

}
