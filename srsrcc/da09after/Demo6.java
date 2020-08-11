package da09after;


public class Demo6 {
    public static void main(String[] args) {
        String s="helloworld";
        //获取字符串的长度
        System.out.println(s.length());
        System.out.println("+++++++++++++++++");
        //将制定的字符串连接到该字符串的末尾

         String s2=s.concat("***haha");        // 拼接
        System.out.println(s2);
        char s3=s.charAt(0);
        System.out.println(s3);
       // System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println("+++++++++++++++++++++++++++++");
        // 返回目标第一次出现的索引，没有返回-1
        int s4=s.indexOf('l');
        System.out.println(s4);
//        System.out.println(s.indexOf("l"));
        // 从start开始  截取字符串到字符串结尾的值
        String s5=s.substring(6);
        System.out.println(s5);
//        System.out.println(s.substring(5));
        System.out.println(s.substring(0));
        // 从start开始到end结束的截取  ，左闭右开
        System.out.println(s.substring(3, 8)); //lowor
    }


}
