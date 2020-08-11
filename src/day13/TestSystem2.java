package day13;

import java.util.ArrayList;
import java.util.Arrays;

public class TestSystem2 {
    public static void main(String[] args) {
        // 将 src中前三个元素，赋值到dest数组前三个位置上复制元素前
        // 操作之后：dest{1,2,3,9,10}
        int src[] = new int []{1,2,3,4,5};
        int dest[] = new int []{6,7,8,9,10};
        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(dest));
    }
}
