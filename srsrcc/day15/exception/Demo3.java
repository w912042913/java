package day15.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo3 {
    public static void main(String[] args) throws ParseException {
        String s ="1994-01-02";
       timeFormat(s);
    }
    public  static  void timeFormat(String str) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM");
        Date parse = df.parse(str);
        System.out.println(parse);
    }
}
