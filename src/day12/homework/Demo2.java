package day12.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
  //把2018-03-04转换为2018年03月04日。
public class Demo2 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date nowDate=df.parse("2018-03-04");
        SimpleDateFormat df2 = new SimpleDateFormat("yyyy年-MM月-dd日");
        String date = df2.format(nowDate);
        System.out.println(date);


    }
}
