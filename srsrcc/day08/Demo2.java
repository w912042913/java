package day08;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("鲁班七号");
        list.add("安琪拉");
        list.add("铠");
        list.add("马可波罗");
        // ArrayList 可以直接打印
        System.out.println(list);
        System.out.println("++++++++++");
//        String s=list.get(1);
//        System.out.println(s);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));

        }
        System.out.println("--------删除-----------");
        String remove = list.remove(2);
        System.out.println(remove);
        System.out.println("删除后的集合"+list);


//       ArrayList<Integer> list=new ArrayList<>();
//       Random random=new Random();
//        for (int i = 0; i <10 ; i++) {
////           int number =random.nextInt(100);
////           list.add(number);
//           list.add(random.nextInt(100));
//
//        }
//        System.out.println(list);
//
//        ArrayList<Integer> list = new ArrayList<>();
//        Random random = new Random();
//        for (int i = 0; i <10 ; i++) {
//            list.add(random.nextInt(100));
//
//        }
//        System.out.println(list);

    }
}
