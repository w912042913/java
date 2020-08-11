package day10;

import java.util.ArrayList;

public class Game {
    public static int number;
    public static ArrayList<String> list;
    //静态代码块：作用是给类变量进行初始化赋值
    static {
        number=2;
        list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
    }
}
