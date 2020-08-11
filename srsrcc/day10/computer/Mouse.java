package day10.computer;

public class Mouse implements  USB {


    @Override
    public void kai() {
        System.out.println("鼠标开启，小灯一闪");
    }

    @Override
    public void guan() {
        System.out.println("鼠标开启，小灯一灭");
    }
    public void click() {
        System.out.println("鼠标点击");
    }

}
