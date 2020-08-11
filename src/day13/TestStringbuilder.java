package day13;

public class TestStringbuilder {
public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        StringBuilder builder1 = builder.append("hello");
        System.out.println("builder = "+ builder);
        System.out.println("builder1 = "+ builder1);
        System.out.println(builder == builder1);// true
    builder.append("haha").append("哈哈").append(true).append(1212);
    System.out.println("builder = "+ builder);
}
}
