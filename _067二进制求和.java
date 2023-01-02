import org.junit.jupiter.api.Test;

public class _067二进制求和 {
    public String addBinary(String a, String b) {
        StringBuilder result=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;//进位
        //循环相加最低位
        while (i>=0&&j>=0){
            int sum=carry;
            sum+=a.charAt(i--)-'0';
            sum+=b.charAt(j--)-'0';
            carry=sum/2;
            result.append(sum%2);
        }
        //a还未遍历完
        while (i>=0){
            int sum=carry;
            sum+=a.charAt(i--)-'0';
            carry=sum/2;
            result.append(sum%2);
        }
        //b未遍历完
        while (j>=0){
            int sum=carry;
            sum+=b.charAt(j--)-'0';
            carry=sum/2;
            result.append(sum%2);
        }
        if (carry==1) result.append(carry);
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(97));
        System.out.println(String.valueOf("11"));
    }
}
