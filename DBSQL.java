import java.sql.*;
public class DBSQL {
    private Connection connection;
    private Statement stmt;

    DBSQL() {
        connection = null;
        stmt = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/salon", "root", "Password1234");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
