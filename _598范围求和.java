import java.util.HashMap;
import java.util.TreeSet;

public class _598范围求和 {
    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length==0) return (int)(long)m*n;
        int [][]res=new int[m][n];
        for (int i=0;i<ops.length;i++){
            int x=ops[i][0];
            int y=ops[i][1];
            for (int j=0;j<x;j++){
                for (int k=0;k<y;k++){
                    res[j][k]+=1;
                }
            }
        }
        int max=0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int[] re : res) {
            for (int i : re) {
                max=Math.max(i,max);
                hashMap.put(i,hashMap.getOrDefault(i,0)+1);
            }
        }
        return hashMap.get(max);
    }
}
