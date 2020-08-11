package day10;

import java.util.Scanner;

public interface Demo2 {
    public static void main(String[] args) {
        //键盘录入一个字符串数据，统计出大写字母，小写字母，数字的个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串数据");
        String s =sc.nextLine();
        int bigcount=0;
        int smallcount=0;
        int numbercount=0;
        for (int i = 0; i <s.length() ; i++) {
           char ch=   s.charAt(i);
           // 对每个字符进行判断
            if(ch >='A'&& ch<='Z')
            {
                bigcount++;
            }
            else if(ch >='a'&& ch<='z')
            {
                smallcount++;
            }
            else if (ch >='0'&& ch<='9')
            {
                numbercount++;
            }
            else{
                System.out.println("该字符为非法字符");
            }
        }
        System.out.println("大写字符数"+bigcount);
        System.out.println("小写字符数"+smallcount);
        System.out.println("数字字符数"+numbercount);



    }
}
