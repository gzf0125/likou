import java.util.Stack;

public class _232用栈实现队列 {

}
class MyQueue {
    private static Stack<Integer> inStack;
    private static Stack<Integer> outStack;

    public MyQueue() {
        inStack = new Stack<Integer>();
        outStack = new Stack<Integer>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        if (outStack.isEmpty()) in2out();
        return outStack.pop();
    }

    public int peek() {
        if (outStack.isEmpty()) in2out();
        return outStack.peek();
    }

    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    private void in2out() {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }
}
