import java.util.Arrays;
import java.util.HashMap;

public class _506相对名次 {
    public String[] findRelativeRanks(int[] score) {
        String []result=new String[score.length];
        HashMap<Integer, Integer> index = new HashMap<>();
        for (int i=0;i<score.length;i++){
            index.put(score[i],i);
        }
        Arrays.sort(score);
        for (int i=score.length-1;i>=0;i--){
            int ind=index.get(score[i]);
            if (i==score.length-1) result[ind]="Gold Medal";
            else if (i==score.length-2) result[ind]="Silver Medal";
            else if (i==score.length-3) result[ind]="Bronze Medal";
            else result[ind]=""+(5-i);
        }
        return result;
    }
}
