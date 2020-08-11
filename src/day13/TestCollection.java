package day13;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
    public static void main(String[] args) {
        //使用多态形式创建集合对象
        Collection<Object> coll = new ArrayList<>();
        // add
        coll.add("小鲁班");
        coll.add("小后裔");
        coll.add("小凯");
        //contains(E e);判断集合中是否包含给定的元素
        System.out.println(coll.contains("小鲁班"));
        System.out.println(coll.contains("王昭君"));
        // remove(E e); 把给定元素e从集合中删除
        System.out.println(coll.remove("小鲁班"));
        System.out.println(coll);
        // isEmpty(); 判断当前集合是否为空
        System.out.println(coll.isEmpty());
        // size();  返回集合中元素的个数
        System.out.println(coll.size());
        Object[] objects =coll.toArray();
        for (int i = 0; i <objects.length; i++) {
            System.out.println(objects[i]);

        }
        // clear(), 清空集合中的所有元素
        coll.clear();
        System.out.println(coll);
    }
}
