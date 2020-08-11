package day16.singlelan;

//顾名思义就是实例在用到的时候去创建，比较懒
//延迟初始化
public class singleLan {
//    private static singleLan instance; //实例
//    private singleLan(){};  //构造函数
//    public static singleLan getInstance()
    private static singleLan instance;
    private singleLan(){};
    public static singleLan getInstance()




   {

        //特点，只是第一次生成对象，效率较高
        if (instance == null);
        {
            instance = new singleLan();
        }
        return instance;
    }

}
