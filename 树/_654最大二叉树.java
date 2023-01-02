package 树;

import java.util.Arrays;
import java.util.stream.Stream;

public class _654最大二叉树 {
    public class TreeNode {
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

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return maxTree(nums,0,nums.length-1);
    }
    public TreeNode maxTree(int []nums,int left,int right){
        if (left>right) return null;
        int maxindex=left;
        for (int i=maxindex+1;i<=right;++i){
            if (nums[i]>nums[maxindex]){
                maxindex=i;
            }
        }
        TreeNode result = new TreeNode(nums[maxindex]);
        result.left=maxTree(nums,left,maxindex-1);
        result.right=maxTree(nums, maxindex+1, right);
        return result;
    }


}