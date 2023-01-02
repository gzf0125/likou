public class _441排列硬币 {
    public int arrangeCoins(int n) {
        if (n==0)return 0;
        int i=1;
        while (n>=i){
            n-=i;
            i++;
        }
        return i-1;
    }
}
