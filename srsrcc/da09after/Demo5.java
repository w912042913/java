package da09after;

public class Demo5 {
    public static void main(String[] args) {
//        String s1="hello";
//        String s2="hello";
//        String s3="Hello";
//
//
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3));
//        System.out.println(s1.equalsIgnoreCase(s3));
//      int i=2;
//        int j=2;
//        char m='2';
//        System.out.println( i==j );
//        System.out.println(m== j);
        Object o1 = new Object();
        Object o2 = new Object();
//        // 都是比较的地址值
//        System.out.println(o1.equals(o2));// false
//        System.out.println(o1==o2);// false
        String a = new String("abcd");
        String b = new String("abcd");
        // abcd 放在常量词中
        String c="abcd";
        String d="abcd";
        if(a==b){  //false
            // 不是同一个对象
            System.out.println("a==b");
        }
        if(a.equals(b)){    //true
            //String 重写了equals
            System.out.println("a==b equals");
        }
        if(c==d){ //true 共享同一变量
            System.out.println("c==d");
        }
        if(c.equals(d)){
            System.out.println("c==d equals");
        }
    }


}
