package day15.lambdaDemo;

public class Demo7 {
    public static void main(String[] args) {
        // 使用lambda表达式 调用测试
        invokeShow(100,a->a+100);

    }
    public static void invokeShow(int a ,Show show){
        show.showNum(a);
        System.out.println(show.showNum(a));
    }
}

