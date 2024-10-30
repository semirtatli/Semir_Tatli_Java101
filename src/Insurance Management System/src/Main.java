import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        LocalDate currentDate = LocalDate.now();
        User user = new User("Steve", "Jobs", "stevejobs@gmail.com","Apple123", "Entreprenaur",36, null, currentDate);
        HomeAdress home = new HomeAdress("Antalya");
        Individual individual = new Individual(user);
        AddressManager.addAddress(user, home);

        try {
            individual.login(user);  // Giriş işlemi yapılır
            // Kullanıcının login durumu alınır
            System.out.println("Login status: " + individual.getLoginStatus());
        } catch (InvalidAuthenticationException e) {
            System.out.println(e.getMessage());
        }

        User user1 = new User("Steve", "Jobs", "stevejobs@gmail.com", "Apple123", "Entrepreneur", 36, null, LocalDate.now());
        User user2 = new User("Bill", "Gates", "billgates@gmail.com", "Microsoft123", "Entrepreneur", 38, null, LocalDate.now());

        Individual individualAccount = new Individual(user1);
        Enterprise enterpriseAccount = new Enterprise(user2);

        // Hesapları ekle
        accountManager.addAccount(individualAccount);
        accountManager.addAccount(enterpriseAccount);

        // Klavyeden email ve şifre al
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = sc.next();
        System.out.print("Enter your password: ");
        String password = sc.next();

        // Login işlemi
        Account account = accountManager.login(email, password);
        if (account != null) {
            System.out.println("Welcome, " + account.user.getName());
        } else {
            System.out.println("Login failed.");
        }

        System.out.println("Hello world!");


        System.out.println("Hello world!");
    }
}