package day08;

public class Teacher extends  Employee{
    String level;
    int num = 6;
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
}