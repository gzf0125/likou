import java.util.zip.InflaterOutputStream;

public class _877石子游戏 {
    public boolean stoneGame(int[] piles) {
        //piles堆数为偶数，先手必赢
//        return true;
        int n=piles.length;
        int sum=0;
        if (n==0) return false;
        int[][]dp=new int[n][n];
        for (int i=0;i<n;i++){
            dp[i][i]=piles[i];
            sum+=piles[i];
        }
        for (int i=n-1;i>0;i--){
            for (int j=i+1;j<n;j++){
                dp[i][j]=Math.max(piles[i]-dp[i+1][j],piles[j]-dp[i][j-1]);
            }
        }
        return dp[0][n-1]>=0;
    }

}
