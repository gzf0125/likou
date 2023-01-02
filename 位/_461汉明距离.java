package 位;

import static java.lang.Integer.bitCount;

public class _461汉明距离 {
    public int hammingDistance(int x, int y) {
        //对两数异或后求里面有多少个一，（x=x&（x-1)可以快速求出二进制有多少一，使最后结果为0
        int count=0;//0101 5&4=4 0101 & 0100 最低位1消去    0100 & 0011 =0000
        for (int xor=x^y;xor!=0;xor=xor&(xor-1)){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Integer a=new Integer(5);
        System.out.println(bitCount(a));
    }
}
