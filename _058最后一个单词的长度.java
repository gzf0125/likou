public class _058最后一个单词的长度 {
    public static int lengthOfLastWord(String s) {
        int end=s.length()-1;
        int result=0;
        while (end>=0&&s.charAt(end)==' ') end--;
        if (end<0) return 0;
        int start=end;
        while (start>=0&&s.charAt(start)!=' ')start--;
        return end-start;
    }
}
