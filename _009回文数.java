public class _009回文数 {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        if (x==0) return true;
        String s = Integer.toString(x);
        char[] chars = s.toCharArray();
        int n=chars.length;
        for (int left=0,right=n-1;left!=right&&left<right;){
            if (chars[left]!=chars[right]) return false;
            else {
                left++;
                right--;
            }
        }
        return true;
    }
    //计算倒序值
    public boolean isPalindrome1(int x){
        if (x<0) return false;
        int num=x;
        int cur=0;
        while (num!=0){
            cur=cur*10+num%10;
            num=num/10;
        }
        if (cur==x) return true;
        else return false;
    }
    //官解 反转一半数字
    public boolean isPalindrome2(int x){
// 特殊情况：
        // 如上所述，当 x < 0 时，x 不是回文数。
        // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
        // 则其第一位数字也应该是 0
        // 只有 0 满足这一属性
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
        return x == revertedNumber || x == revertedNumber / 10;
    }
    //反转一半数字
    public boolean isPalindrome3(int x){
        if (x<0 || (x%10==0&&x!=0)) return false;
        int cur=0;
        while (x>cur){
            cur=cur*10+x%10;
            x=x/10;
        }
        return x==cur ||x==cur/10;
    }
}
