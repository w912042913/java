package day11.InterDemo2;

import java.sql.SQLOutput;

public class TestInterDemo2 {
    public static void main(String[] args) {
//        new FlyAble() {
//            @Override
//            public void fly() {
//                System.out.println();
//            }
//        /* 等号左边：是多态赋值，（抽象类）接口类型引用子类对象  */
             /* 等号右边：定义并创建了该接口的子类对象 */
           FlyAble f =  new FlyAble(){
            @Override
            public void fly(){
                System.out.println("嗷嗷飞");
            }
        };
        System.out.println(f);
        showFly(f);
        }
         public  static  void  showFly(FlyAble flyAble ){  // static 不用创建成员对象
        flyAble.fly();
         }

    }

