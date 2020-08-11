package day14;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        //创建map对象
        HashMap<String, String> map = new HashMap<>();
        map.put("吕布","貂蝉");
        map.put("孙策","大乔");
        map.put("周瑜","二乔");
        map.put("刘备","甘夫人");
        // 如果put时间存在，那么会覆盖之前的值
        map.put("刘备","孙尚香");
        System.out.println(map);
        // 访问
        String s = map.get("刘备");
        String b = map.get("周瑜");
        System.out.println(s);
        System.out.println(b);
        // 删除
        String re = map.remove("周瑜");
        System.out.println(re);
        System.out.println(map.containsKey("刘备"));
        System.out.println(map.containsKey("二乔"));

    }
}
