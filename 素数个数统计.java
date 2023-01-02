public class 素数个数统计 {
    public static void main(String[] args) {
        System.out.println(bf(100));
        System.out.println(eratosthenes(100));
    }
    public static int bf(int n){
        int count=0;
        for (int i = 2; i < n; i++) {
            count += isPrime(i) ? 1 : 0;
        }
        return count;
    }
    private static boolean isPrime(int x){
        for (int i = 2; i <x ; i++) {
            if (x%i==0){
                return false;
            }
        }
        return true;
    }
    //埃筛法 素数 非素数（合数）
    public static int eratosthenes(int n){
        boolean[] notprime=new boolean[n];//默认false代表素数；
        int count=0;
        for (int i = 2; i < n; i++) {
            if (!notprime[i]){
                count++;
                for (int j=i*i;j<n;j+=i){//j是合数的标记位
                    notprime[j]=true;
                }

            }
        }
        return count ;
    }


}
