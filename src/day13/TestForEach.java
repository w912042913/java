package day13;

import java.util.ArrayList;
import java.util.Collection;

public class TestForEach {
    public static void main(String[] args) {
        int []arr ={1,4,6,7,8};
        for (  int a : arr){
            System.out.println(a);
        }
        //使用多态形式创建集合对象
        Collection<String> coll = new ArrayList<>();
        // add
        coll.add("小鲁班");
        coll.add("小后裔");
        coll.add("小凯");
        for(String a : coll)
        {
            System.out.println(a);
        }
    }
}
