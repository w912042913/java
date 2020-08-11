package day12;

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("张三",18);
        Person p2 = new Person("张三",18);
        Person p3 = new Person("张三",19);

        //day12.Person@16b98e56
        System.out.println(p1);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }
}
