package day15.exception;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

public class Demo4 {
    public static void main(String[] args) {
        try {
            read("小秘.txt");
        } catch (Exception e) {
            // 在try中抛出异常，在括号中就捕获什么异常类型
            e.printStackTrace();
            System.out.println("++++++");
            System.out.println(e);
        }
        finally {
            System.out.println("不管try和catch执行啥了，我这里都会执行");
        }
        System.out.println("end");
    }
    public static void read(String str) throws FileNotFoundException {
        if(!str.equals("小秘密.txt")){
            throw new FileNotFoundException("你的文件怎么消失了呢");
        }
    }
}
