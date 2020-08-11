package day15.guessNumber;

import java.util.Random;
import java.util.Scanner;

public class Demo6
{
    public static void main(String[] args)
    {
        //猜数字
        //游戏开始时，会随机生成一个1~100之间的随机整数number
        //玩家猜一个数字：guessNmuber和number进行比较
        //统计玩家猜了几次，给予输出提示
        Random r=new Random();
        Scanner scanner=new Scanner(System.in);
        int number=r.nextInt(100)+1;
      //  System.out.println("number="+number);
      int count=0;
        while(true){
            count++;
            System.out.println("请输入您猜的数字");
             int guessNumber=scanner.nextInt();
            System.out.println("guessNumber="+guessNumber);
            if(guessNumber>number)
            {
                System.out.println("猜大了");
            } else if(guessNumber<number){
                System.out.println("猜小了");
            }else{
                System.out.println("你用"+count+"猜对了");
                break;
            }
        }




        }




    }


