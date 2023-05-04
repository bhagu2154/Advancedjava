package select;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class select {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/cyber_success";
        String username="root";
        String password="root@1234";
        Connection connection= DriverManager.getConnection(url,username,password);
        Statement statement= connection.createStatement();
         ResultSet selectQuery=statement.executeQuery("select * from student");
while (selectQuery.next()){
    System.out.println(selectQuery.getInt(1) + "\t" +selectQuery.getString(2) + "\t" +
            selectQuery.getString(3) + "\t" +selectQuery.getString(4));
}
    }
}
