import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");
        DatabaseConnection dbConnect = new DatabaseConnection();
        User admin0 = new User(0, "admin0", "admin0","admin0", "admin");
        admin0.login("admin0", "admin0");
        User logedInUser = admin0;
        UserActions userActions = new UserActions(logedInUser);


        System.out.println("isLoggedIn: " + admin0.isLoggedIn());
        admin0.deleteUser("admin0");



    }
}