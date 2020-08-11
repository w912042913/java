package day12.utils;


import day12.utils.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
        public ArrayList<Integer> divide(int totalMoney, int totalCount) {

        /*随机分配  . totalMoney 单位是分*/
        /*最少一分钱，最多不超过剩下金额平均数的两倍，应该越发越少*/
        /*随机金额公式：  生成一定范围的随机数  1+ random.nextInt(最多不超过剩下金额平均数的2倍)
             随机金额公式：  生成一定范围的随机数  1+ random.nextInt(leftMoney/leftCount*2)             */
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        // 分别代表剩下多少钱和剩下多少份
        int leftMoney = totalMoney;
        int leftCount = totalCount;
        // 随机发钱 n-1个，最后一个不需要随机
        for (int i = 0; i < totalCount-1 ; i++) {
            //随机出来的金额
            int money = 1 + random.nextInt(leftMoney/leftCount*2);
             //将随机出来的金额放入集合
             list.add(money);
             // 应该越发越少
            leftCount--; //剩下的份数每次减1
            leftMoney -=money;
        }
           list.add(leftMoney);


           return list;
    }
}