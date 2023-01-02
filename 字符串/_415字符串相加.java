package 字符串;

import java.util.Stack;

public class _415字符串相加 {
    public String addStrings(String num1, String num2) {
        //StringBuilder是一个可变的字符串类
//        1、String内容是不可变的，StringBuilder内容是可变的
//
//        2、StringBuilder处理字符串性能比String好
        StringBuilder stringBuilder=new StringBuilder();
        //记录进位
        int carry=0;
        for (int i=num1.length()-1,j=num2.length()-1;i>=0||j>=0 || carry==1;i--,j--){
            int x=i<0 ? 0:num1.charAt(i)-'0';
            int y=j<0 ? 0:num2.charAt(j)-'0';
            stringBuilder.append(x+y+carry%10);
            carry=(x+y+carry)/10;
        }
        return stringBuilder.reverse().toString();
    }
}
