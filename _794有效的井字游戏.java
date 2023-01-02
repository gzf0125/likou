import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class _794有效的井字游戏 {
    //分类讨论
    public boolean validTicTacToe(String[] board) {
        int xCount=0,oCount=0;
        for (String row : board) {
            for (Character c : row.toCharArray()) {
                if (c=='X'){
                    xCount++;
                }
                if (c=='O'){
                    oCount++;
                }
            }
        }
        if (xCount!=oCount&&xCount-oCount!=1){
            return false;
        }
        if (isWinner(board,'X')&&isWinner(board,'O')) return false;
        if (isWinner(board,'X')&&xCount-oCount!=1) return false;
        if (isWinner(board,'O')&&xCount!=oCount) return false;
        return true;
    }
    public boolean isWinner(String[] board,char c){
        if (board[0].charAt(0)==board[1].charAt(1)&&board[1].charAt(1)==board[2].charAt(2)&&board[2].charAt(2)==c) return true;
        if (board[0].charAt(2)==board[1].charAt(1)&&board[1].charAt(1)==board[2].charAt(0)&&board[2].charAt(0)==c) return true;
        for (int i=0;i<3;i++){
            if (board[i].charAt(0)==board[i].charAt(1)&&board[i].charAt(1)==board[i].charAt(2)&&board[i].charAt(2)==c) return true;
            if (board[0].charAt(i)==board[1].charAt(i)&&board[1].charAt(i)==board[2].charAt(i)&&board[2].charAt(i)==c) return true;
        }
        return false;
    }
}
