import java.util.Arrays;

public class _455分发饼干 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int p1=0,p2=0,count=0;
        while (p1<g.length-1&&p2<s.length-1){
            if (s[p2]>=g[p1]){
                count++;
                p2++;
                p1++;
            }else {
                p2++;
            }
        }
        return count;
    }
}
