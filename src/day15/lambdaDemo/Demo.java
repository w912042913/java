package day15.lambdaDemo;

public class Demo {
    public static void main(String[] args) {
        Cook cook = new CookImpl();
        invoke(cook);
    }
    public static void invoke(Cook cook) {
        cook.makeFood();
    }
}
