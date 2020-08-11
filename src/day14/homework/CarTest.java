package day14.homework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CarTest {
    public static void main(String[] args) {
        HashMap<Car, Integer> map = new HashMap<>();
        Car car1 = new Car("奥迪","黄色");
        Car car2 = new Car("奔驰","黑色");
        Car car3 = new Car("酷路泽","白色");
        map.put(car1,600000);
        map.put(car2,500000);
        map.put(car3,500000);
        Set<Car> cars = map.keySet();
                for(Car car: cars ){
                    Integer integer = map.get(car);
                    System.out.println(car.getName()+car.getColor()+integer);
                }
        Set<Map.Entry<Car, Integer>> entries = map.entrySet();
                for (Map.Entry<Car, Integer> another: entries){
                    Car key = another.getKey();
                    Integer value = another.getValue();
                    System.out.println(key.getName()+key.getColor()+value);
                }
    }
}
