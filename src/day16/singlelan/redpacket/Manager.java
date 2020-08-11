package day16.singlelan.redpacket;

import java.util.ArrayList;

public class Manager extends User {
    public Manager(int leftMoney, String username) {
        super(leftMoney, username);
    }



    public  ArrayList<Integer> send( int money, int count ){
        ArrayList<Integer> redList = new ArrayList<>();
        int leftMoney = super.getLeftMoney();
        if (money>leftMoney){
            System.out.println("余额不足");

            }
        super.setLeftMoney(leftMoney-money);
        int avg = money/count;
        int yu= money%count;
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);

        }
        int last =avg+yu;
        redList.add(last);
        return redList;
    }
}

