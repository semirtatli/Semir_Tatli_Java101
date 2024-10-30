import java.util.ArrayList;
import java.util.Scanner;

public class Enterprise extends Account{

    private ArrayList Insurance = new ArrayList<>();

    public Enterprise(User user){
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

    }

    public void removeAddress(Address address, User user){

    }
}
