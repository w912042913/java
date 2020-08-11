package day15.myGeneric;



  public class MyGenericClassTest {
      public static void main(String[] args) {
          //创建一个泛型为String的类
          MyGenericClass<String> my = new MyGenericClass<>();
          my.setMvp("哈登");
          String mvp = my.getMvp();
          System.out.println(mvp);
      }
}