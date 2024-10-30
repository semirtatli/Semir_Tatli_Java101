import java.sql.*;

public class User {
    private int id;
    private String name;
    private String userName;
    private String password;
    private String type;
    private boolean isLoggedIn;
    public User() {

    }

    public User(int id, String name, String userName, String password, String type) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.type = type;
        this.isLoggedIn = false;

    }

    public boolean login(String userName, String password){

            if (this.userName.equals(userName) && this.password.equals(password)) {
                isLoggedIn = true;
                System.out.println(userName + " logged in successfully.");
                return true;
            } else {
                System.out.println("Login failed for " + userName);
                return false;
            }
    }

    public boolean logout(String userName){
        if (this.userName.equals(userName)) {
            isLoggedIn = false;
            System.out.println(userName + " logged out successfully.");
            return true;
        } else {
            System.out.println("Logout failed for " + userName);
            return false;
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





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

}
