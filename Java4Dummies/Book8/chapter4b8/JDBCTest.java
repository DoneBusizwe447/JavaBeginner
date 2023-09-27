package book8.chapter4b8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest {
    public static void main(String[] args) {


        Connection con = getConnection();

    }
        private static Connection getConnection () {
            Connection con = null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost/Movies";
                String user = "root";
                String pw = "Qhawe9017$";
                con = DriverManager.getConnection(url, user, pw);
            } catch (ClassNotFoundException e) {
                System.out.println(e.getMessage());
                System.exit(0);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                System.exit(0);
            }
            System.out.println("SUCCESFUL CONNECTION");
            return con;
        }
    }

