package 动态规划;

public class _121买卖股票的最佳时机 {
    //暴力穷举
    public int maxProfit(int[] prices) {
        int result = 0,buy,sell;
        for (buy=0;buy<prices.length-1;buy++){
            for (sell=buy+1;sell<prices.length;sell++){
                if (prices[sell] - prices[buy]>result){
                    result=prices[sell] - prices[buy];
                }
            }
        }return result;
    }
    public int maxProfit1(int[] prices) {
        int len=prices.length;
        int [][]dp=new int[len][2];
        if (len<2) return 0;
        dp[0][0]=0;
        dp[0][1]=-prices[0];
        for (int i=1;i<len;i++){
            dp[i][0]=Math.max(prices[i]+dp[i-1][1],dp[i-1][0]);  //第i填未持有股票的利益，可能已卖，可能与昨天一样
            dp[i][1]=Math.max(-prices[i],dp[i-1][1]);//第i填持有股票的利益,本金0购入则为当天价的负数
            if (i==len-1) return dp[i][0];
        }
        return 0;
    }
    public int maxProfit2(int[] prices) {
        int ans=0;
        int min=prices[0];
        for (int i=1;i<prices.length;i++){
            if (prices[i]>min){
                ans=Math.max(prices[i]-min,ans);
            }else {
                min=prices[i];
            }
        }
        return ans;
    }

}
