import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection con;

    DatabaseConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/Acenta";
        String username = "postgres";
        String password = "admin";

        // Initialize the connection
        this.con = DriverManager.getConnection(url, username, password);
    }

    public static DatabaseConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public Connection getConnection() {
        return con;
    }
}
