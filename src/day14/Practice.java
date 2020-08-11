package day14;



import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
         map.put("苹果手机","iphone11");
         map.put("安卓手机","华为荣耀");
        Set<Map.Entry<String, String>> entryset = map.entrySet();
        for (Map.Entry<String, String>  newentryset :entryset) {
            String key = newentryset.getKey();
            String value = newentryset.getValue();
            System.out.println(key+"    "+value);
        }

    }

}
