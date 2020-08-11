package day10;

public class Demo4 {
    public static void main(String[] args) {
//        double d1 =Math.abs(-5);   //绝对值
//        System.out.println(d1);
//         Math.ceil(3.3); //返回大于等于参数的最小整数
//        System.out.println(Math.ceil(3.3));
//        Math.floor(-3.3);
//        System.out.println(Math.floor(3.3));  //返回小于等于参数的最小值
//        Math.round(5.5);
//        System.out.println(        Math.round(5.5));  //四舍五入
        //计算-10.8到5.9之间，绝对值大于6小于2.1的整数有多少个
        double min=-10.8;
        double max=5.9;
        int count=0;
        for (double i = Math.ceil(min); i <=Math.floor(max); i++) {
            if(Math.abs(i)>6||Math.abs(i)<2.1)
            {
                count++;
                System.out.println(i);
            }


        }
        System.out.println(count);
    }
}
