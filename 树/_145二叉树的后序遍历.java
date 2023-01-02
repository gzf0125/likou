package 树;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class _145二叉树的后序遍历 {
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        accessTree(root,res);
        return res;
    }
    private void accessTree(TreeNode root,List<Integer> res){
        if (root==null) return;
        accessTree(root.left,res);
        accessTree(root.right,res);
        res.add(root.val);
    }
    //
    public List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> Stack = new Stack<>();
        TreeNode preAcess=null;
        while (root != null || !Stack.isEmpty()) {
            while (root!=null) {
                Stack.push(root);
                root = root.left;
            }
            root=Stack.pop();
            if (root.right==null || root.right==preAcess){
                res.add(root.val);
                preAcess=root;
                root=null;
            }else {
                Stack.push(root);
                root=root.right;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();

    }
}

