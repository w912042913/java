package day16.singlelan.redpacket;

import java.util.ArrayList;
import java.util.Random;

public class Member  extends  User {
    public Member() {
    }

    public Member(int leftMoney, String username) {
        super(leftMoney, username);
    }

    public void receive(ArrayList<Integer> redList){
        Random random = new Random();
        int index = random.nextInt(redList.size());
        Integer removeMoney = redList.remove(index);
        int leftMoney = super.getLeftMoney();
        int zong =removeMoney+leftMoney;
        super.setLeftMoney(zong);
    }
}
