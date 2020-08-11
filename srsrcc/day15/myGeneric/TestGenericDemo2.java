package day15.myGeneric;

public class TestGenericDemo2 {
    public static void main(String[] args) {
        MyGenericMethod my= new MyGenericMethod();
        //在调用方法时确定了泛型的类型
        my.show("aaa");
        my.show("123");
        my.show2("12.45");
    }
}
