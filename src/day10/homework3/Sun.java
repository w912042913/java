package day10.homework3;

import day10.computer.USB;

public class Sun  extends Star implements Universe {

    @Override
    public void doAnything() {
        System.out.println("sun:太阳吸引着9大行星旋转");

    }
    @Override
    public void shine() {
        System.out.println("sun:光照八分钟,到达地球");
    }
}
