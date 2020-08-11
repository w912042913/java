package day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo3 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("吕布","貂蝉");
        map.put("孙策","大乔");
        map.put("周瑜","二乔");
        map.put("刘备","甘夫人");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry: entrySet) {
            String key = entry.getKey();
            String val = entry.getValue();
            System.out.println(key+"="+val);

        }
    }


}
