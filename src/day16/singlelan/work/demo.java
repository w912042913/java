package day16.singlelan.work;

public class demo {
    public static void main(String[] args) {
        double son = 2;
        double mum = 1;
        double sum = 0;
        double kong;
        for(int i=2 ;i<=20;i++){
           kong = son;
            son = son + mum;
            mum = kong;
            sum = sum + son/mum;
        }
        System.out.println("前20项和为"+sum);
    }

}
