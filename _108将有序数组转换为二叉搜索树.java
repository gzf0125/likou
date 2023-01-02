import javax.swing.*;

public class _108将有序数组转换为二叉搜索树 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode() {
        }
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums,0,nums.length-1);
    }
    private TreeNode dfs(int[]nums,int left,int right){
        if (left>right) return null;
        int mid=left+(right-left)>>1;
        TreeNode root = new TreeNode(nums[mid]);
        root.left=dfs(nums,left,mid-1);
        root.right=dfs(nums,mid+1,right);
        return root;
    }
    public TreeNode sortedArrayToBST1(int []nums){
       return helper(nums,0,nums.length-1);
    }
    private TreeNode helper(int []nums,int left,int right){
        if (left>right) return null;
        int mid=(left+right)>>1;
        TreeNode root=new TreeNode(mid);
        root.left=helper(nums,left,mid-1);
        root.right=helper(nums,mid+1,right);
        return root;
        }



}


