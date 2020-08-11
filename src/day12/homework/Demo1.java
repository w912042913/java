package day12.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//请用代码实现:获取当前的日期,并把这个日期转换为指定格式的字符串,如2088-08-08 08:08:08。

public class Demo1 {
    public static void main(String[] args) throws ParseException {
        Date nowDate = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String nowTime=df.format(nowDate);
        System.out.println(nowTime);

    }
}
