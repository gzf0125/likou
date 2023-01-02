public class _014最长公共前缀 {
    public String longestCommonPrefix(String[] strs) {
        int min=strs[0].length();
        int index=0;
        for (int i=1;i<strs.length;i++){
            if (min>strs[i].length()){
                min=strs[i].length();
                index=i;
            }
        }
        String str=strs[index];//当前最短子串
        for (int i=0;i<strs.length;i++){
            String curstr = strs[i].substring(0, min);
            while (!curstr.equals(str)&&min!=0){
                str=str.substring(0,--min);
                curstr=curstr.substring(0,min);
            }
        }
        return str;
    }
}
