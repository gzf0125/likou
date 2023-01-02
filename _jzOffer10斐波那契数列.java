import 字符串.字符串匹配之KMP算法;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _jzOffer10斐波那契数列 {
    //存储缓存
    private HashMap<Integer,Integer> hashMap = new HashMap<>();
    public int fib(int n) {
        if (n==0||n==1){
            return n;
        }
        //读取缓存
        Integer first=hashMap.get(n-1);
        Integer second=hashMap.get(n-2);
        if (first==null){
            first=fib(n-1);
            hashMap.put(n-1,first);
        }
        if (second==null){
            second=fib(n-2);
            hashMap.put(n-2,second);
        }
        return (int)  ((first+second)%(1e9+7));
    }
}
