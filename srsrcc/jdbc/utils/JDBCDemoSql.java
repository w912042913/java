package jdbc.utils;

import java.sql.*;

public class JDBCDemoSql {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt =null;
        PreparedStatement pstmt2 =null;
        ResultSet rs = null;
        try{
            conn =JDBCUtils.getConnection();
            String sql ="update account set balance =balance - ? where id = ?";
            String sql2 ="update account set balance =balance + ? where id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt2 = conn.prepareStatement(sql2);
            pstmt.setInt(1, 500);
            pstmt.setInt(2, 1);
            pstmt2.setInt(1, 500);
            pstmt2.setInt(2, 2);
            int count = pstmt.executeUpdate();
            int count2 = pstmt2.executeUpdate();
            System.out.println(count +count2);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(null, pstmt, conn);
            JDBCUtils.close(null, pstmt2, conn);
        }
    }
}
