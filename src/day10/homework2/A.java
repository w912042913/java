package day10.homework2;

public interface A {
       public abstract void  showA();
     private  static  void show10(String str){
         for (int i = 0; i <10; i++) {
             System.out.println(str+" ");
         }

    }
     static void showB10(){
         show10("BBBB");
     }
    static void showC10(){
        show10("CCCC");
    }
}
