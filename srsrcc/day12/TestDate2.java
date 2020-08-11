package day12;

import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate2 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        //DateFormat 是日期/时间格式化子类的抽象类
        DateFormat dt=new SimpleDateFormat("yyyy年MM月dd日");
        String str=dt.format(date);
        System.out.println(str);

    }
}
