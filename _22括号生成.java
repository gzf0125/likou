import java.util.ArrayList;
import java.util.List;

public class _22括号生成 {
    List<String> result=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
//        dfs(n,n,"");
        recursion(n,0,0,"");
        return result;
    }
    //深度优先
    public void dfs(int left,int right,String curstr){
        if (left==0 && right==0){
            result.add(curstr);
            return;
        }
        if (left>0){
            dfs(left-1, right, curstr+"(");
        }
        if (right>left){
            dfs(left, right-1, curstr+")");
        }
    }
    //递归
    public void recursion(int n,int left,int right,String curstr){
        if (right>left) return;

        if (right==left &&left==n && right==n){
            result.add(curstr);
            return;
        }
        if (left<=n){
            recursion(n,left+1,right,curstr+"(");
        }
        if (right<left) recursion(n,left,right+1,curstr+")");


    }
}
