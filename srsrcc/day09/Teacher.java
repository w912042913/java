package day09;

import day09.Employee;

public class Teacher extends  Employee{
    String level;
    int num = 6;

    public Teacher() {   //访问构造方法
        super(); // 调用父类的构造方法
        System.out.println("Teacher构造函数被调用");
    }




    public void printName(){
        System.out.println("name" + name);
    }
    public void show(){
        System.out.println("Fu = " + super.num);
        System.out.println("Zi = " + this.num);
    }
    @Override
    public void work(){
        System.out.println("高效率的卖力干活");
    }
    public void workTest(){
        //调用本类的方法
        this.work();
        super.work();
    }
}
