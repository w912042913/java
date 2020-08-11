package da09after;

import java.util.Scanner;

public class DemoAI {
//    public static void main(String[] args) {
//        //价值一个亿的AI核心代码
//        Scanner scanner = new Scanner(System.in);
//        String str1;
//        while(true){
//            str1 = scanner.next();
//            str1=str1.replace("吗"," ");
//            str1=str1.replace("?","！");
//            System.out.println(str1);
//
//        }
//    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        while (true){
            str=scanner.next();
            str=str.replace('我','你');
            str=str.replace('爱','不');
            System.out.println(str);
        }
    }
}
