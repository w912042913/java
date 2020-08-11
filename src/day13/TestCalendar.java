package day13;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
    public static void main(String[] args) {
        // 创建calendar对象, 静态常量可以通过类名.方法名调用
        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar);
        // 设置年
        int year = calendar.get(Calendar.YEAR);
        // 设置月
        int month = calendar.get(Calendar.MONTH) + 1;
        // 设置日
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH) ;


        System.out.println(year+"年"+month+"月"+dayOfMonth+"日"); // 2020年7月28日
    }
}