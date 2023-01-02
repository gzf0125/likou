import java.util.HashMap;

public class _13罗马数字转整数 {
    public int romanToInt(String s) {
       int sum=0;
       int prenum=getValue(s.charAt(0));
       for (int i=1;i<s.length();i++){
           int curnum=getValue(s.charAt(i));
           if (prenum<curnum){
               sum-=prenum;
           }else {
               sum+=prenum;
           }
           prenum=curnum;
       }
       sum+=prenum;
       return sum;
    }
    public int getValue(char c){
        switch (c){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default: return 0;
        }
    }
}
