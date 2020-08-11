package day12;

//import java.util.Date;
//
//public class TestDate {
//    public static void main(String[] args) {
//        // 创建日期对象，返回当前时间
//        System.out.println(new Date());
//        // 创建日期对象，把当前的毫秒值转换为日期对象
//        System.out.println(new Date(0l));
//        // 把日期对象转换为对应的毫秒值
//        System.out.println(new Date().getTime());
//        int i = 0;
//        while (true){
//            if(i==1000000)
//            {break;}
//            i++;
//        }
//        System.out.println(new Date().getTime());
//    }
//}
public class ToStringTest{
    static int i = 1;
    public static void main(String args[]){

        ToStringTest a = new ToStringTest();

        System.out.println(1);
        System.out.println("3"+a);
        System.out.println(3);
        a.i++;
        System.out.println("me " + a.i);//me 2
        System.out.println("love "+a );//love java
    }
    @Override
    public String toString(){
        System.out.print("I ");//I
        System.out.println(2);
        return "java ";
    }
}
