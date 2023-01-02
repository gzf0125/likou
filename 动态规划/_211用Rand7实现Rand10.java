package 动态规划;
//用RandN%10=rand10,N为10的倍数
//Rand7-->Rand49-->Rand40%20=rand10
/*
rand7=1-7
rand7-1=0-6
rand7-1*7=0,7,14,21,28,35,42
rand7-1*7+rand7-1 0~48 49
判断第4步的值，去除大于等于40的值
 */
public class _211用Rand7实现Rand10 {
    public int rand10() {
        int temp=40;
        while (temp>=40){
            //temp=(rand7()-1)*7+rand7()-1;
        }
        return  temp%10+1;
    }
}
