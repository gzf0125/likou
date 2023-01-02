package 字符串;

import java.util.LinkedList;

public class _394字符串编码 {

}
class Solution {
    int ptr;
    public String decodeString(String s) {
        LinkedList<String> stk = new LinkedList<>();
        ptr=0;
        while (ptr<s.length()){
            char cur = s.charAt(ptr);
            if (Character.isDigit(cur)){

            }
        }
        return null;
    }
}
