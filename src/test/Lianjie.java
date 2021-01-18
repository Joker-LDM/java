package test;

import java.sql.*;

public class Lianjie
{
    public static void main(String[] args) throws SQLException {
        Connection con=null;
        String url="jdbc:oracle:thin:@localhost:1521";
                String username="opts";
                String password="opts1234";
                try{
                    con= DriverManager.getConnection(url,username,password);
                    String num;
                        Statement sql = con.createStatement();
                        ResultSet rs = sql.executeQuery("select * from mess");
                        int max=rs.getRow();
                    System.out.println(max);
                } catch (SQLException e) {
                    e.printStackTrace();
                    //System.out.println(e);
                }
    }
}
