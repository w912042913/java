package studentAdmin.dao.Impl;
import java.sql.*;
import studentAdmin.dao.StudentDao;
import studentAdmin.domain.Student;
import jdbc.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl  implements StudentDao {
    @Override
    public List<Student> findAll() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<Student> list = null;
        try {
            //连接
            conn = JDBCUtils.getConnection();
            String sql = "select *from studentmanage; ";
            //查询
            pstmt = conn.prepareStatement(sql);
            //得到结果
             rs = pstmt.executeQuery(); // 查询
            list = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                int score = rs.getInt("score");
                String addr = rs.getString("addr");
                int tel = rs.getInt("tel");
                Student s = new Student();
                s.setId(id);
                s.setName(name);
                s.setGender(gender);
                s.setScore(score);
                s.setAddr(addr);
                s.setTel(tel);
                list.add(s);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(null, pstmt, conn);
        }
        return list;
    }


    @Override
    public void remove(Integer id) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            //连接
            conn = JDBCUtils.getConnection();
            String sql = "delete from studentmanage where id=1";
            //查询
            pstmt = conn.prepareStatement(sql);
            //得到结果
            int count = pstmt.executeUpdate();//更新
            System.out.println(count);


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(null, pstmt, conn);
        }
    }

    @Override
    public void update(Student student) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            //连接
            conn = JDBCUtils.getConnection();
            String sql = "update studentmanage set score=+? where id=?; ";
            //查询
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, 20);
            pstmt.setInt(2, 2);
            //得到结果
            int count = pstmt.executeUpdate(); // 更新

            System.out.println(count);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(null, pstmt, conn);
        }


    }


    @Override
    public void save(Student student) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            //连接
            conn = JDBCUtils.getConnection();
            String sql = "insert into studentmanage values(5,'wang王希杰','男',100,'沈阳',1111)";
            //查询
            pstmt = conn.prepareStatement(sql);
            //得到结果
            int count = pstmt.executeUpdate();
            System.out.println(count);


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(null, pstmt, conn);
        }

    }
}