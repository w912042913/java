package day13;

import java.sql.SQLOutput;

public class TestSystem1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i <9999; i++) {
            System.out.print(i);
        }
        System.out.println( );
        long END = System.currentTimeMillis();
        System.out.println("耗时"+(END-start));
    }
}
