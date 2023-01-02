package 贪心算法;

import com.sun.org.apache.regexp.internal.RE;

import java.awt.image.DirectColorModel;
import java.util.LinkedList;
import java.util.Queue;

public class _640Dota2参议院 {
    public String predictPartyVictory(String senate) {
        int n=senate.length();
        char[] c=senate.toCharArray();
        Queue<Integer> Radiant=new LinkedList<Integer>();
        Queue<Integer> Dire=new LinkedList<Integer>();
        for (int i=0;i<n;i++){
            if (c[i]=='R') Radiant.offer(i);
            else Dire.offer(i);
        }
        while (!Radiant.isEmpty()&&!Dire.isEmpty()){
            int RadiantIndex=Radiant.poll();
            int DireIndex=Dire.poll();
            if (RadiantIndex<DireIndex){
                Radiant.offer(RadiantIndex+n);
            }else {
                Dire.offer(DireIndex+n);
            }
        }
        if (!Radiant.isEmpty()) return "Radiant";
        else return "Dire";
    }
}
