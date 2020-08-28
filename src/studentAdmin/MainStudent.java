package studentAdmin;

import studentAdmin.dao.Impl.StudentDaoImpl;
import studentAdmin.domain.Student;

import java.util.List;


public class MainStudent {
    public static void main(String[] args) {
        System.out.println("-------- 欢迎登录low版学生管理系统---------");

        StudentDaoImpl studentDao = new StudentDaoImpl();
        System.out.println("----------学生列表------------------------");
        List<Student> list = studentDao.findAll();
        for (Student s:list){
            System.out.println(s);
        }
//        System.out.println("----------保存学生------------------------");
//        Student s = new Student();
//        studentDao.save(s);
//        System.out.println("----------------删除---------------------");
//        studentDao.remove(1);//对
//        System.out.println("--------更改学生---------");
//        studentDao.update(s);




    }
}
