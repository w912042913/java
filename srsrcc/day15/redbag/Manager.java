package day15.redbag;

import day10.homework2.A;

import java.util.ArrayList;

public class Manager extends User {
    public Manager(String username, int leftMoney) {
        super(username, leftMoney);
    }


    public ArrayList<Integer> send(int totalMoney, int count){
            ArrayList<Integer> redList = new ArrayList<>();
            int leftMoney =getLeftMoney();
            if(totalMoney>leftMoney){
                System.out.println("金额不足");
            }
            super.setLeftMoney(leftMoney-totalMoney);
             int avg=leftMoney/count;
             int yu=leftMoney%count;
        for (int i = 0; i <count-1 ; i++) {
            redList.add(avg);
        }

             int last= avg+yu;
             redList.add(last);
             return redList;
    }
}

