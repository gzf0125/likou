package 树;

import javax.print.attribute.standard.NumberUp;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _144二叉树的前序遍历 {
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

    //栈
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> Stack = new Stack<>();
        while (root!=null || !Stack.isEmpty() ){
            while (root!= null){
                res.add(root.val);
                Stack.push(root);
                root=root.left;
            }
            root=Stack.pop();
            root=root.right;
        }
        return res;
    }
    //递归
    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        accessTree(root,res);
        return res;
    }
    private void accessTree(TreeNode root,List<Integer> res){
        if (root==null) return;
        res.add(root.val);
        accessTree(root.left,res);
        accessTree(root.right,res);
    }



}
