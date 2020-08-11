package day12;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        person();
    }

    public static void person() throws Exception {
        System.out.println("输入你的出生日期yyyy-mm-rr");
        String birthDate = new Scanner(System.in).next();//定义字符型的出生日期
        Date nowDate = new Date();//定义现在的时间
        SimpleDateFormat df = new SimpleDateFormat("yyyy:MM:dd");
        Date birthDay =df.parse(birthDate);
        //得到当前时间的毫秒值
        long nowDate1=nowDate.getTime();
        //得到出生时间的毫秒值
        long birthDay1=birthDay.getTime();
        //差值毫秒值
        long cha=nowDate1-birthDay1;
        if( cha<0 ){
            System.out.println("滚犊子");
        }
        else {
            System.out.println(cha/1000/60/60/24);
        }
    }
}