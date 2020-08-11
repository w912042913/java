package day14.homework;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("游戏联盟","德莱文");
        map.put("王者荣耀","安琪拉");
        map.put("刺激战场","98k");
        System.out.println(map);
        String str = map.put("游戏联盟","荣耀行刑官");
        System.out.println(str);
         String str1  =map.remove("王者荣耀");
        System.out.println(str1);

    }
}
