package 树;

import org.junit.jupiter.api.Test;

import java.util.*;

public class 二叉树遍历前序递归 {
    public class TreeNode{
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<Integer>();
        Stack<TreeNode> stack=new Stack<>();
        while (root!=null || !stack.isEmpty()){
            while (root!=null){
                result.add(root.val);
                stack.push(root);
                root=root.left;
            }
            //如果左子树为空，到右子树
            root=stack.pop();
            root=root.right;
        }
        return result;

    }
}
