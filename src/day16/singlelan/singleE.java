package day16.singlelan;

public class singleE
{
    private singleE(){
    }

    private static singleE instance=new singleE();
    public static singleE getInstance(){
        return instance;
    //方法获取对象calendar构造方法被private 或protected修饰不能被直接new
}
}