package day13;

import java.util.ArrayList;
import java.util.Collection;

public class homework {
        public static class CollectionTest01{
            public static void main(String[] args) {
                Collection<String> list = new ArrayList<>();
                list.add("a");
                list.add("a");
                list.add("b");
                list.add("b");
                list.add("c");
                System.out.println("a:"+listTest(list, "a"));
                System.out.println("b:"+listTest(list, "b"));
                System.out.println("c:"+listTest(list, "c"));
                System.out.println("xxx:"+listTest(list, "xxx"));
            }

            //定义方法统计集合中指定元素出现的次数
            public static int listTest(Collection<String> list, String s){
                //定义计数器，初始化为0
                int count = 0;
                //增强for遍历集合
                for (String string : list) {
                    //判断传入方法的字符与遍历集合的是否一致
                    if (s.equals(string)) {
                        //如果一致，加1
                        count++;
                    }
                }
                return count;
            }
        }
    }
