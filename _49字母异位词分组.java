import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _49字母异位词分组 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);//将chars数组转化为字符串
            if (!hashMap.containsKey(key)) hashMap.put(key,new ArrayList<>());
            hashMap.get(key).add(str);
        }
        return new ArrayList<>(hashMap.values());

    }
}
