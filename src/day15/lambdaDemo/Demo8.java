package day15.lambdaDemo;

public class Demo8 {
    public static void main(String[] args) {
        invoke(()-> System.out.println());
    }
    public static void invoke(Cook cook) {
        cook.makeFood();
    }
}
