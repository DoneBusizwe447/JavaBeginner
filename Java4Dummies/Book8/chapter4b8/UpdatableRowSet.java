package book8.chapter4b8;


import java.sql.*;

public class UpdatableRowSet {
    private static Connection con;

    public static void main(String[] args) {
        con = getConnection();
        try {
            Statement stmt = con.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            );
            ResultSet rs = stmt.executeQuery("select * from movie");
//            rs.absolute(10);
//            rs.deleteRow();

            rs.absolute(6);
            rs.updateInt("year", 1975);
            rs.updateRow();
            System.out.println("UPDATED!");

            rs.moveToInsertRow();
            rs.updateString("title", "Monty Python and the Holy Grail");
            rs.updateInt("year", 1975);
            rs.updateDouble("price", 13.95);
            rs.insertRow();
            rs.moveToCurrentRow();
            System.out.println("ROW INSERTED!");
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
            System.exit(0);
        }

    }

    private static Connection getConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/movies";
            String user = "root";
            String pw = "Qhawe9017$";
            con = DriverManager.getConnection(url, user, pw);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
            System.exit(0);
        } catch (SQLException e) {
            System.out.println(e);
            System.exit(0);
        }
        System.out.println("SUCCESSFUL CONNECTION!");
        return con;
    }
}
