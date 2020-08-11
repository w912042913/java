package day15.lambdaDemo;

public class Demo5 {
    public static void main(String[] args) {
        // 使用lambda表达式 调用测试
        invokeCalc(5,6,( a , b)->a+b);

    }
    public static void invokeCalc(int a ,int b,Calculator calculator){
        int res = calculator.calc(a, b);
        System.out.println(res);
    }
}
