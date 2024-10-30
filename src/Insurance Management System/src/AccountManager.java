import java.util.TreeSet;

public class AccountManager {

    private TreeSet<Account> accountList = new TreeSet<>();

    // Hesap ekleme fonksiyonu
    public void addAccount(Account account) {
        accountList.add(account);
    }

    // Login fonksiyonu
    public Account login(String email, String password) {
        for (Account account : accountList) {
            // Kullanıcı eşleşmesi var mı diye kontrol edelim
            if (account.user.getEmail().equals(email)) {
                try {
                    // Giriş denemesi yapılıyor
                    if (account.user.getPassword().equals(password)) {
                        account.login(account.user);
                        System.out.println("Login successful for: " + email);
                        return account;
                    }
                } catch (InvalidAuthenticationException e) {
                    System.out.println("Login failed: " + e.getMessage());
                }
            }
        }
        System.out.println("No account found with the provided email.");
        return null;
    }
}
