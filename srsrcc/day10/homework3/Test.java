package day10.homework3;

public class Test {
    public static void main(String[] args) {
        Star s = new Star();
        s.shine();
        System.out.println("==================");
//        Universe universe = new Sun();
//        universe.doAnything();
//        Sun sun  = (Sun) universe;
//        sun.shine();
        Universe u = new Sun();
        u.doAnything();  //向上转型
        Sun ss = (Sun)u;
        ss.shine();  // 向下转型

    }
}
