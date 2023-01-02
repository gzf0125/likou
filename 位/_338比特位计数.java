package 位;

public class _338比特位计数 {
    public int[] countBits(int n) {
        int bits[]=new int[n+1];
        for (int i=1;i<=n;i++){
            bits[i]=bits[i&(i-1)]+1;
        }
        return bits;
    }
    //x=x&(x-1)清楚二进制最低位的1

    //利用奇偶性解决
    public int[] countBits1(int n) {
        int bits[]=new int[n+1];
        bits[0]=0;
        for (int i = 1; i <=n; i++) {
            bits[i]=((i&1)==1 ? bits[i-1]+1 : bits[i>>1]);//判断是奇数还是偶数，1为奇，0为偶偶数二进制1的个数为其减半的个数
        }
        return bits;
    }
}
