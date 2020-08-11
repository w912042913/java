package day15.lambdaDemo;

public class Demo2 {
    public static void main(String[] args) {
        invoke(()->{
            System.out.println("lambda表达式做的饭好了");
        });
    }
    public static void invoke(Cook cook){
        cook.makeFood();
    }
}