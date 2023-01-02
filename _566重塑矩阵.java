public class _566重塑矩阵 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if (m*n<r*c) return mat;
        int []temp=new int[m*n];
        for (int i=0,index=0;i<m;i++){
            for (int j=0;j<n;j++){
                temp[index]=mat[i][j];
                index++;
            }
        }
        int result[][]=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                result[i][j]=temp[i*c+j];
            }
        }
        return result;
        //123   //1234
        //456   //5678
        //789   //9123
        //123
    }
}
