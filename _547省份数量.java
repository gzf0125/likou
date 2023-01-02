import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class _547省份数量 {
    //深度优先
    public int findCircleNum(int[][] isConnected) {
        int citynum=isConnected.length;//记录城市数量
        boolean []visited=new boolean[citynum];//标记是否已访问
        int res=0;// 定义 res 来累计遍历过的连通域的数量
        for (int i = 0; i < citynum; i++) {
            // 若当前顶点 i 未被访问，说明又是一个新的连通域，则遍历新的连通域且cnt+=1.
            if (!visited[i]) {
                res++;
                dfs(i, isConnected, visited);
            }
        }
        return res;

    }
    private void dfs(int i, int[][] isConnected, boolean[] visited) {
        // 对当前顶点 i 进行访问标记
        visited[i] = true;
        // 继续遍历与顶点 i 相邻的顶点（使用 visited 数组防止重复访问）
        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[i][j] == 1 && !visited[j]) {
                dfs(j, isConnected, visited);
            }
        }
    }
    //广度优先
    public int findCircleNum1(int[][] isConnected){
        int citynum=isConnected.length;//城市数量
        boolean [] visited=new boolean[citynum];//是否已访问
        int res=0;//记录连通域数据
        Queue<Integer> queue=new LinkedList();
        for (int i=0;i<citynum;i++){
            // 若当前顶点 i 未被访问，说明又是一个新的连通域，则bfs新的连通域且cnt+=1.
            if (!visited[i]){
                res++;
                queue.offer(i);
                visited[i]=true;
                while (!queue.isEmpty()){
                    int v = queue.poll();
                    for (int w = 0; w < citynum; w++) {
                        if (isConnected[v][w] == 1 && !visited[w]) {
                            visited[w] = true;
                            queue.offer(w);
                        }
                    }
                }
            }

        }
        return res;

    }
    //并查集
    public int findCircleNum2(int[][] isConnected){
        UnionFind uf = new UnionFind();
        for(int i = 0;i < isConnected.length;i++){
            uf.add(i);
            for(int j = 0;j < i;j++){
                if(isConnected[i][j] == 1){
                    uf.merge(i,j);
                }
            }
        }

        return uf.getNumOfSets();


    }
    class UnionFind{
        //记录父节点
        private HashMap<Integer,Integer> father;
        //记录集合的数量
        private int numOfSets=0;
        //构造函数
        public UnionFind(){
            father=new HashMap<Integer, Integer>();
            numOfSets=0;
        }
        //添加
        public void add(int x){
            if (!father.containsKey(x)){
                father.put(x,null);
                numOfSets++;
            }
        }
        //合并
        public void merge(int x,int y){
            int rootX=find(x);
            int rootY=find(y);
            if (rootX!=rootY){
                father.put(rootX,rootY);
                numOfSets--;
            }
        }
        //查找根节点
        public int find(int x){
            int root=x;
            while (father.get(root)!=null){
                root=father.get(root);
            }
            //路径压缩
            //当x不为祖先节点时
//            while (x!=root){
//                //x的父节点
//                int original_father=father.get(x);
//                //x指向祖先节点
//                father.put(x,root);
//                //父节点赋给x
//                x=original_father;
//            }
            return root;
        }
        public boolean isConnected(int x, int y) {
            return find(x) == find(y);
        }

        public int getNumOfSets() {
            return numOfSets;
        }



    }




}
