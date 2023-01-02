public class _提莫攻击 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int  result=0;
         for (int i=0;i<timeSeries.length-1;i++){
             if (timeSeries[i+1]-timeSeries[i]>=duration){
                result+=duration;
             }else {
                 result+=(timeSeries[i+1]-timeSeries[i]);
             }
         }
         result+=duration;
         return result;
    }
}
