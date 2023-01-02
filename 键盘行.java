

import java.util.*;

public class 键盘行 {
    public String[] findWords(String[] words) {
        String rowIdx="12210111011122000010020202";
        List<String> res = new ArrayList<>();
        for (int i=0;i<words.length;i++){
            int idx=rowIdx.charAt(Character.toLowerCase(words[i].charAt(0))-'a');
            boolean flag=true;
            for (Character word : words[i].toLowerCase().toCharArray()) {
                if (rowIdx.charAt(word-'a')!=idx){
                    flag=false;
                    break;
                }
            }
            if (flag){
                res.add(words[i]);
            }

        }
        String [] result=new String[res.size()];
        for (int i=0;i<res.size();i++){
            result[i]=res.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("456");
    }


}
