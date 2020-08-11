package day13;

import java.util.Calendar;

public class TestCalendar2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH) ;
        System.out.println(year+"年"+month+"月"+dayOfMonth+"日"); // 2020年7月28日
        calendar.set(Calendar.YEAR, 2021);
        calendar.set(Calendar.DAY_OF_MONTH, 31);
         year = calendar.get(Calendar.YEAR);
         month = calendar.get(Calendar.MONTH) + 1;
         dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH) ;
        System.out.println("set之后");
        System.out.println(year+"年"+month+"月"+dayOfMonth+"日"); // 2021年7月28日
    }
}
