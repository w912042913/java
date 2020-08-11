package day16.singlelan.redpacket;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager(10000,"王希杰");
        Member member1 = new Member(0,"王一涵");
        manager.show();
        member1.show();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入红包金额");
        int money = scanner.nextInt();
        System.out.println("想发几个红包");
        int count = scanner.nextInt();
        ArrayList<Integer> redList = manager.send(money, count);
        member1.receive(redList);
        manager.show();
        member1.show();

    }
}