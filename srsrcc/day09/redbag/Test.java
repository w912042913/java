package day09.redbag;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 200);
        Member one = new Member("成员A", 10);
        Member two = new Member("成员B", 10);
        Member three = new Member("成员C", 10);
        manager.show();
        one.show();
        two.show();
        three.show();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入金额");
        int money = scanner.nextInt();
        System.out.println("请输入发几个包");
        int count = scanner.nextInt();
        // 调用发红包
        ArrayList<Integer> redList = manager.send(money, count);
        // 调用收红包
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show();
        one.show();
        two.show();
        three.show();


    }
}