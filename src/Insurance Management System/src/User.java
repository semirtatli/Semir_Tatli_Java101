import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class User implements Address{
    private String name;
    private String surname;
    private String email;
    private String password;
    private String Job;
    private int age;
    private ArrayList<Address> addressList;
    private LocalDate lastLogin;


    public User(String name, String surname, String email, String password, String job, int age, ArrayList<Address> addressList, LocalDate lastLogin) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        Job = job;
        this.age = age;
        this.addressList = addressList;
        this.lastLogin = lastLogin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(ArrayList<Address> addressList) {
        this.addressList = addressList;
    }

    public LocalDate getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDate lastLogin) {
        this.lastLogin = lastLogin;
    }

}
