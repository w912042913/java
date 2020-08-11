package day12.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入你的出生日期");
        String scanner = new Scanner(System.in).next();
        Date chushengdate = new Date();
        SimpleDateFormat DF = new SimpleDateFormat("yyyy-MM-dd");
        Date newchushengdate= DF.parse(scanner);
        long xianzaishijian=newchushengdate.getTime();
        long chushengshijian=chushengdate.getTime();
        long cha = chushengshijian- xianzaishijian;
        if (cha<0)
            System.out.println("cuowu");
        else
            System.out.println(cha/1000/60/60/24);


    }
}
