package day10.interfaceDemo;

public interface LiveAble {
    // 定义抽象方法
    public abstract void eat();
    public abstract void sleep();
    public static void run(){
        System.out.println("嗷嗷跑");
    }
   public default void fly(){
       System.out.println("左右飞");

   }
   private  void func1(){
       System.out.println("func1");
   }
   private  void func2(){
       System.out.println("func2");

    }
}