package 字符串;

import java.util.Stack;

public class _20有效的括号 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c=='('){
                stack.push(')');
            }else if (c=='['){
                stack.push(']');
            }else if (c=='{'){
                stack.push('}');
            }else if (stack.isEmpty() || stack.pop()!=c){
                return false;
            }}
        return stack.isEmpty();
    }
    public boolean isValid1(String s) {
        Stack<Character> stack = new Stack<>();
        if (s==null || s.length()==1) return false;
        for (Character c : s.toCharArray()) {
            if (c=='{'){
                stack.push('}');
            }else if (c=='['){
                stack.push(']');
            }else if (c=='('){
                stack.push(')');
            }else if (stack.isEmpty()||stack.pop()!=c) return false;
        }
        return stack.isEmpty();
    }
    }

