package day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
          list.add("abc");
          list.add("def");
          //list.add(3); 集合已经明确了具体的元素存放的类型
        // 已经明确了类型，在使用迭代器的时候，迭代器也同样知道遍历元素的具体类型
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            // 使用iterator()在这里可以直接获取String类型
            System.out.println(next);
        }
    }
}
