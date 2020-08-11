package day15.guessNumber;

import java.util.Random;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //猜数字
        //游戏开始时，会随机生成一个1~100之间的随机整数number
        //玩家猜一个数字：guessNmuber和number进行比较
        //统计玩家猜了几次，给予输出提示
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int number =rd.nextInt(100)+1;
        int count =0;
        System.out.println("请输入一个数");
        while(true){
            count++;
            int guessnumber =sc.nextInt();
            if(guessnumber>number){
                System.out.println("猜大了");
            }
             else if(guessnumber<number){
                System.out.println("猜小了");
            }
             else {
                System.out.println("一共猜了"+count+"次才猜对的哦！");
            }
        }
    }
}
