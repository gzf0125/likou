public class _066加一 {
    public int[] plusOne(int[] digits) {
        int length=digits.length-1;
        if (digits[length]+1!=10) {
            digits[length]+=1;
            return digits;
        }
        for (int i=length;i>=0;i--){
            if (digits[i]==9)   digits[i]=0;
            else {
                digits[i]+=1;
                return digits;
            }
        }
        if (digits[0]==0){
            digits=new int[digits.length+1];
            digits[0]=1;
        }
        return digits;

    }
    //优化
    public int[] plusOne1(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; --i) {
            if (digits[i] != 9) {
                ++digits[i];
                for (int j = i + 1; j < n; ++j) {
                    digits[j] = 0;
                }
                return digits;
            }
        }

        // digits 中所有的元素均为 9
        int[] ans = new int[n + 1];
        ans[0] = 1;
        return ans;


    }
}
