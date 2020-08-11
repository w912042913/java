package day10.computer;

public class Computer {
    // 包含运行，关机，使用USB
    public void run(){
        System.out.println("电脑运行起来了");
    }
    //关机
    public void shutDown(){
        System.out.println("关机");
    }
    // 使用USB
    // 当电脑对象调用这个方法时，必须给其传递一个符合USB规则的USB设备
    public void useUSB(USB u){
        // 判断是否有usb
        if(u!=null){
            u.kai();
             //进行类型转换，调用特有的方法
            if(u instanceof Mouse){    // 属于
                Mouse m=(Mouse)u;
                m.click();
            }
            else if(u instanceof KeyBoard){
                KeyBoard kb=(KeyBoard)u;
                kb.type();
            }
            u.guan();
        }
    }
}
