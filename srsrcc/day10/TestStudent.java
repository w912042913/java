package day10;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("wang",18);
        Student s2 = new Student("WANG",18);
        Student s3 = new Student("WAN",18);
        Student s4 = new Student("WA",18);
        s1.show();
        s2.show();
        s3.show();
        s4.show();
        System.out.println(Student.numberStudent);
        Student.showNum();
    }
}
