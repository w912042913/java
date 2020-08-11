package day10.interfaceDemo;

public class Animal implements LiveAble {   //不能animal round 静态方法不能继承
    //无法从写默认方法

    @Override
    public void eat() {
        System.out.println("就知道吃");
    }

    @Override
    public void sleep() {
        System.out.println("还睡呀");
    }
    @Override
    public void fly(){
        System.out.println("左右飞");
    }
}