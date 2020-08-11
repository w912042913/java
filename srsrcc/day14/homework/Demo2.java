package day14.homework;

import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("游戏联盟","暗夜猎手");
        map.put("王者荣耀","麦林炮手");
        map.put("刺激战场","盲僧");
        Collection<String> values = map.values();

        System.out.println(values);
        System.out.println(map);
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
              String s1= entry.getKey();
              String s2= entry.getValue();
            System.out.println(s1+"==="+s2);
        }
        Iterator<String> itr = values.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}




