package JavaDesktop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

public static Connection getConnection() {
        Connection conn = null;   
        String databaseName = "eng_javadesktop";
        String user = "root";
        String password = "admin"; 
        String url = "jdbc:mysql://localhost:3306/" + databaseName;
        
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return conn;
    }

    public static void main(String[] args) {
        try {
            Connection c = DbConnection.getConnection();
            System.out.println(String.format("Connected To Database %s " + "Successfully.", c.getCatalog()));
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
