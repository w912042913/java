package day10.homework1;

 public class  B implements A{
     @Override
    public  void showA(){ // 抽象方法要想调用它就得用@Override
         System.out.println("AAAA");
     }


 }