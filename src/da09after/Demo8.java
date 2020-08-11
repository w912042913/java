package da09after;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo8 {
    public static void main(String[] args) {
        String s="1123456@qq.com";
        String[] split = s.split("@");
        System.out.println(Arrays.toString(split));

    }
}
