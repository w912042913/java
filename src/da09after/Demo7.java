package da09after;


public class Demo7 {
    public static void main(String[] args) {
        String s="helloworld";
        //转化为字符数组
        char[] chars=s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);


        }
        System.out.println();
        byte[] bytes = s.getBytes();
        // 转化为字节数组
        for (int i = 0; i <bytes.length; i++) {
            System.out.println(bytes[i]);
        }
         s= s.replace('h','H');

        System.out.println(s);
         s =s.replace('w','W');
        System.out.println(s);
    }
}
