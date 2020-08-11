package day15.lambdaDemo;

import java.util.Arrays;
import java.util.Comparator;

public class TestPerson {
    public static void main(String[] args) {
        Person[] array = {
                new Person("貂蝉", 223),
                new Person("孙尚香", 18),
                new Person("妲己", 300),
                new Person("杨玉环", 221),
        };
        Comparator<Person> comp =  new Comparator<>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }

            @Override
            public int hashCode() {
                return super.hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }
        };
        //第二个参数是排序规则
        Arrays.sort(array,comp);

        for(Person person : array){
            System.out.println(person);
        }

    }
//    new Comparator

}