import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserActions {
    private String name;
    private String userName;
    private String password;
    private String type;
    private boolean isLoggedIn;
    private int roleType;
    public UserActions(User user) {

        Scanner sc = new Scanner(System.in);

        searchUserName("admin0");

do {
    int choice;
    System.out.println("Hello " + user.getUserName());
    System.out.println("1 - List all personal\n2 - Add new personal\n3 - Delete personal\n4 - Update personal\n5 - Filter users by role");
    System.out.print("What do you want to do?");

    choice = sc.nextInt();
    switch (choice) {
        case 1:
            listAllPersonal();
            break;
        case 2:
            System.out.println("Please enter the name of the user: ");
            name = sc.next();
            System.out.println("Please enter the user name of the user: ");
            userName = sc.next();
            System.out.println("Please enter the password of the user: ");
            password = sc.next();
            System.out.println("Please enter the type of the user: ");
            type = sc.next();

            addUser(name, userName, password, type);
            break;
        case 3:
            System.out.print("Please enter the userName you want to be deleted: ");
            userName = sc.next();
            deleteUser(userName);
            break;
        case 4:
            System.out.println("Please enter the name of the user: ");
            name = sc.next();
            System.out.println("Please enter the user name of the user: ");
            userName = sc.next();
            System.out.println("Please enter the password of the user: ");
            password = sc.next();
            System.out.println("Please enter the type of the user: ");
            type = sc.next();
            updateUser(name, userName, password, type);
            break;
        case 5:
            System.out.print("Press 1 for Admin\nPress 2 for Personal: ");
            roleType = sc.nextInt();
            filterUserRole(roleType);
            break;
        default:
            break;
    }
}while(true);





    }

    public void listAllPersonal() {
        String query = "SELECT * FROM Users Where type = admin";


        try {
            // Get the connection from DatabaseConnection singleton instance
            Connection con = DatabaseConnection.getInstance().getConnection();

            // Use PreparedStatement to execute the insert query
            Statement st = con.createStatement();

            // Execute the update (INSERT)
            ResultSet rs = st.executeQuery(query);


            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String password = rs.getString("password");
                String type = rs.getString("type");
                System.out.println(id + ", " + name + ", " + password + ", " + type);
            }
            // Close resources
            st.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void searchUserName(String userName) {
        String query = "SELECT * FROM Users Where username = ?";
        List<User> users = new ArrayList<>();

        try {
            // Get the connection from DatabaseConnection singleton instance
            Connection con = DatabaseConnection.getInstance().getConnection();

            // Use PreparedStatement to execute the insert query
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, userName);

            // Execute the update (INSERT)
            ResultSet rs = ps.executeQuery();


            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String password = rs.getString("password");
                String type = rs.getString("type");
                //users.add(user);
                System.out.println(id + ", " + name + ", " + password + ", " + type);
            }
            // Close resources
            ps.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addUser(String name, String userName, String password, String type) {
        String query = "INSERT INTO Users (name, username, password, type) VALUES (?, ?, ?, ?)";

        try {
            // Get the connection from DatabaseConnection singleton instance
            Connection con = DatabaseConnection.getInstance().getConnection();

            // Use PreparedStatement to execute the insert query
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, userName);
            ps.setString(3, password);
            ps.setString(4, type);

            // Execute the update (INSERT)
            int rowsAffected = ps.executeUpdate();
            System.out.println("User added successfully. Rows affected: " + rowsAffected);

            // Close resources
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(String userName, String newName, String newPassword, String newType) {
        String query = "UPDATE Users SET name = ?, password = ?, type = ? WHERE username = ?";

        try {
            // Get the connection from DatabaseConnection singleton instance
            Connection con = DatabaseConnection.getInstance().getConnection();

            // Use PreparedStatement to execute the update query
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, newName);
            ps.setString(2, newPassword);
            ps.setString(3, newType);
            ps.setString(4, userName);

            // Execute the update
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("User updated successfully. Rows affected: " + rowsAffected);
            } else {
                System.out.println("No user found with username: " + userName);
            }

            // Close resources
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void filterUserRole(int role) {
        String query = "SELECT * FROM Users Where type = ?";
String roleType = "personal";
        if(role == 1)
            roleType = "admin";
        if (role == 2)
            roleType = "personal";

        try {
            // Get the connection from DatabaseConnection singleton instance
            Connection con = DatabaseConnection.getInstance().getConnection();

            // Use PreparedStatement to execute the insert query
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, roleType);

            // Execute the update (INSERT)
            ResultSet rs = ps.executeQuery();


            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String password = rs.getString("password");
                String type = rs.getString("type");
                System.out.println(id + ", " + name + ", " + password + ", " + type);
            }
            // Close resources
            ps.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(String userName) {
        String query = "DELETE FROM Users Where userName = ?";

        try {
            // Get the connection from DatabaseConnection singleton instance
            Connection con = DatabaseConnection.getInstance().getConnection();


            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, userName);


            // Execute the update (INSERT)
            int rowsAffected = ps.executeUpdate();
            System.out.println("User deleted successfully. Rows affected: " + rowsAffected);

            // Close resources
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void login(String userName, String password){

        User user = new User();
        user.login(userName, password);
    }

    public void logout(String userName){
        User user = new User();
        user.logout(userName);
    }
}
