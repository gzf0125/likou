import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _257二叉树的所有路径 {
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
    //深度优先
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        dfs(root,"",paths);
        return paths;
    }
    public void dfs(TreeNode root,String path,List<String> paths){
        if (root!=null){
            StringBuilder pathSB=new StringBuilder(path);
            pathSB.append(Integer.toString(root.val));
            if (root.left==null&&root.right==null){
                paths.add(pathSB.toString());
            }else {
                pathSB.append("->");
                dfs(root.left,pathSB.toString(),paths);
                dfs(root.right,pathSB.toString(),paths);
            }
        }
    }
    //广度优先
    public List<String> binaryTreePaths1(TreeNode root){
        List<String> paths = new ArrayList<>();
        if (root==null) return paths;
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        Queue<String> pathQueue = new LinkedList<>();
        nodeQueue.offer(root);
        pathQueue.offer(Integer.toString(root.val));
        while (!nodeQueue.isEmpty()){
            TreeNode node = nodeQueue.poll();
            String path = pathQueue.poll();
            if (node.left==null&&node.right==null){
                paths.add(path);
            }else {
                if (node.left!=null){
                    nodeQueue.offer(node.left);
                    pathQueue.offer(new StringBuilder(path).append("->").append(node.left.val).toString());               }
                if (node.right!=null){
                    nodeQueue.offer(node.right);
                    pathQueue.offer(new StringBuilder(path).append("->").append(node.right.val).toString());
                }
            }
        }
        return paths;

    }
}
