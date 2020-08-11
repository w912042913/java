package day10.computer;

public class KeyBoard implements USB {
@Override
    public void kai() {
        System.out.println("键盘开启，小彩灯嗷嗷闪");

    }

 @Override
    public void guan() {
        System.out.println("键盘关闭");
    }

    public void type() {
        System.out.println("键盘打字");
    }

}
