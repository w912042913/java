package day10;

public class Student {
    private String name;
    private int  age;
    private int  sid;
    //类变量，记录学生数量
    public static int  numberStudent=0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.sid =++numberStudent;
    }
    public static void showNum(){
        System.out.println(numberStudent);
    }
    public void show(){
        System.out.println("学员：name="+name+",age="+age+"sid="+sid);
    }
}
