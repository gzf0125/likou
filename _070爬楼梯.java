public class _070爬楼梯 {
    public int climbStairs(int n) {
        if (n<=1) return n;
        int[]dp=new int[n+1];//爬到第n级台阶的方案数
        dp[0]=1;dp[1]=1;
        for (int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    //滚动数组优化
    public int climbStairs1(int n) {
        if (n<=1) return 1;
        int pre=0;
        int  prepre=0;
        int res=1;
        for (int i=1;i<=n;i++){
            prepre=pre;
            pre=res;
            res=pre+prepre;
        }
        return res;
    }

}
