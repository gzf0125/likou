public class _069x的平方根 {
    //二分法
    public int mySqrt(int x) {
        int left=0,right=x,ans=-1;
        while (left<=right){
            int mid=(left+right)>>1;//位右移一位减半
            //(left+right)>>1==left+(right-left)>>1
            //(left+right)可能会溢出,右边好
            if ((long)mid*mid<=x){
                ans=mid;
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(5>>1);
    }

}
