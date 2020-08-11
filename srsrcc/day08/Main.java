package day08;

import java.util.ArrayList;
import java.util.Random;

public class Main {



    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(100)+1);
        }
        System.out.println("筛选前");
        System.out.println(list);
        ArrayList<Integer> arrayList =new ArrayList<>();
        for (int j = 0; j <list.size() ; j++) {
            if (list.get(j)%2==0){
                arrayList.add(list.get(j));
            }
        }
        System.out.println("筛选后：");
        System.out.println(arrayList);
    }
}
