package day15.redbag;

import java.util.ArrayList;
import java.util.Random;

public class Number extends User {
    public Number(String username, int leftMoney) {
        super(username, leftMoney);
    }
     public void receive(ArrayList<Integer> redList ){
         Random random = new Random();
         int index =random.nextInt(redList.size());
         // 收完之后删除
         Integer removeMoney = redList.remove(index);
         // 更新余额
         int leftMoney = super.getLeftMoney();
         int updateMoney = leftMoney +removeMoney;
         super.setLeftMoney(updateMoney);

     }
}
