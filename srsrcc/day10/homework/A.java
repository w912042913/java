package day10.homework;

public interface A {
    public abstract void showA();
    public default void showB(){     //默认的方法
        System.out.println("BBBB");
    }

}
