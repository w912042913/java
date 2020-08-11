package day15.guessNumber;

import java.util.Random;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        //猜数字
        //游戏开始时，会随机生成一个1~100之间的随机整数number
        //玩家猜一个数字：guessNmuber和number进行比较
        //统计玩家猜了几次，给予输出提示
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int number  = random.nextInt(100)+1;
        int count= 0;
        System.out.println("请输入一个数哦！");
        while (true){
            count++;
            int guessmunber =sc.nextInt();
            if(guessmunber>number){
                System.out.println("你猜大了哦");
            }else if (guessmunber<number){
                System.out.println("你猜小了哦");
            }
            else {
                System.out.println("恭喜你猜了"+count+"次，猜对了哦");
            }


            }
        }


    }

