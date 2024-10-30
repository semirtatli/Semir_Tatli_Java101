import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Individual extends Account{

    private ArrayList Insurance = new ArrayList<>();
    public Individual(User user){
        super(user);
    }



    public final void showUserInfo(){
        user.toString();
    }

    // Kullanıcının login olma durumu (başarılı ya da başarısız)
    public AuthenticationStatus login(User user) throws InvalidAuthenticationException {
        Scanner sc = new Scanner(System.in);
        String email;
        String password;

        System.out.print("Enter the email: ");
        email = sc.next();

        System.out.print("Enter the password: ");
        password = sc.next();

        if (email.equals(user.getEmail()) && password.equals(user.getPassword())) {
            System.out.println("Login successful");
            setLoginStatus(AuthenticationStatus.SUCCESS);  // Login durumu SUCCESS olarak güncellenir
            return AuthenticationStatus.SUCCESS;
        } else {
            setLoginStatus(AuthenticationStatus.FAIL);  // Login durumu FAIL olarak güncellenir
            throw new InvalidAuthenticationException("Login failed. Invalid email or password.");
        }
    }

    @Override
    public void addInsurance() {

    }

    public void addAddress(Address address, User user){
        if (user.getAddressList() == null) {
            user.setAddressList(new ArrayList<>());
        }
        user.getAddressList().add(address);
        System.out.println("Address added to " + user.getName() + "'s address list.");
        System.out.println(user.getAddressList().toString());
    }

    public void removeAddress(Address address, User user){
        if (user.getAddressList() != null && user.getAddressList().contains(address)) {
            user.getAddressList().remove(address);  // Adresi listeden çıkar
            System.out.println("Address removed from " + user.getName() + "'s address list.");
        } else {
            System.out.println("Address not found in " + user.getName() + "'s address list.");
        }
    }

}
