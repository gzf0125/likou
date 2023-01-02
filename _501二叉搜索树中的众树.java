import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class _501二叉搜索树中的众树 {
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
    List<Integer> ans = new ArrayList<>();
    int maxCOunt,count,base;
    public int[] findMode(TreeNode root){
       dfs(root);
       int res[]=new int[ans.size()];
       for (int i=0;i<ans.size();i++){
           res[i]=ans.get(i);
       }
       return res;

    }
    private void dfs(TreeNode root){
        if (root==null) return ;
        dfs(root.left);
        updata(root.val);
        dfs(root.right);
    }
    private void updata(int x){
        if (x==base){
            count++;
        }else {
            count=1;
            base=x;
        }
        if (count==maxCOunt){
            ans.add(x);
        }
        if (count>maxCOunt){
            maxCOunt=count;
            ans.clear();
            ans.add(x);
        }

    }
}
