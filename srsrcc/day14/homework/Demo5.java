package day14.homework;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int i = sc.nextInt();
        if(i>=10000){
            System.out.println("输出无效");
        }
        else if(i>0&&i<=10){
            System.out.println(i);
        }
        else if(i>10&&i<100){
            System.out.println((i/10)+(i%10));
        }
        else if(i>=100&&i<999){
            System.out.println(i/100+i/10%10+i%100%10);
        }
        else if(i>=1000&&i<=9999){ //1234    1+2+3
            System.out.println(i/1000+i/100%10+i%100/10+i%1000%100%10);
        }
    }
}
