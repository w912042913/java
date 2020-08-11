package day15.redbag;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("马云",200);
        Number number1 = new Number("王希杰",10);
        Number number2 = new Number("王希杰1",10);
        Number number3 = new Number("王希杰2",10);
        manager.show();
        number1.show();
        number2.show();
        number3.show();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入红包金额");
        int money = scanner.nextInt();
        System.out.println("发几个红包呀!");
        int count =scanner.nextInt();
        ArrayList<Integer> list =manager.send(money,count);
        number1.receive(list);
        number2.receive(list);
        number3.receive(list);
        manager.show();
        number1.show();
        number2.show();
        number3.show();
    }
}