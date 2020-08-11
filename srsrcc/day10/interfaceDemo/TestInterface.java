package day10.interfaceDemo;

public class TestInterface {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.sleep();
        a.fly();   // 调用默认方法

    }
}