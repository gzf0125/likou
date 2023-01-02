import java.util.ArrayList;
import java.util.List;

public class _119杨辉三角 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i=0;i<=rowIndex;i++){
            List<Integer> row = new ArrayList<>();
            for (int j=0;j<=i;j++){
                if (j==0||j==i){
                    row.add(1);
                }else {
                    row.add(result.get(i-1).get(j)+result.get(i-1).get(j-1));
                }
            }
            result.add(row);
            if (i==rowIndex) return row;
        }
        return null;
    }
    public List<Integer> getRow1(int rowIndex){
        List<Integer> result=new ArrayList<>();
        for (int i=0;i<=rowIndex;i++){
            List<Integer> row = new ArrayList<>();
            for (int j=0;j<=i;j++){
                if (j==0||j==i){
                    row.add(1);
                }else {
                    row.add(result.get(j-1)+result.get(j));
                }
            }
            result.clear();
            result.addAll(row);
            if (i==rowIndex) return row;
        }
        return null;
    }
}
