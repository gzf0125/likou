public class _799香槟塔 {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double [][] result=new double[101][101];
        result[0][0] =poured;
        for (int i=0;i<query_row;i++){
            for (int j=0;j<=i;j++){
                double d=(result[i][j]-1.0)/2;
                if (d>0){
                    result[i+1][j]+=d;
                    result[i+1][j+1]+=d;
                }
            }
        }
        return result[query_row][query_glass]>1? 1:result[query_row][query_glass];
    }
}
