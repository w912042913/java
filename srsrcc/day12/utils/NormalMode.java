package day12.utils;

import day12.utils.OpenMode;
import java.util.ArrayList;

public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        // 100/3
        int avg = totalMoney / totalCount;
        int mod = totalMoney % totalCount;// 零头

        for (int i = 0; i < totalCount-1 ; i++) {
            list.add(avg);
        }
        // l零头放在最后一个包中
        list.add(avg+mod);

        return list;
    }
}