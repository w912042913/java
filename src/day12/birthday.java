package day12;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class birthday {
    public static void main(String[] args) throws Exception {
        function();
    }


    public static void function() throws Exception {
        System.out.println("请输入您旁边伙伴的出生日期 格式 yyyy-MM-dd");
        String birthdayString = new Scanner(System.in).next();
        Date currentDate = new Date();// 定义现在的时间
        // 将birthdayString转化成 Date对象
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = df.parse(birthdayString);
        // 1、 获取当前时间对应的毫秒值
        long currentDateTime = currentDate.getTime();
        // 2、 获取出生时间对应的毫秒值
        long birthdayDateTime = birthdayDate.getTime();
        // 3 、 相减
        long resultDateTime = currentDateTime - birthdayDateTime;
        if (resultDateTime < 0){
            System.out.println("老铁逗我呢，你还没出生呢");
        }
        else{
            System.out.println(resultDateTime/1000/60/60/24);
        }

    }
}