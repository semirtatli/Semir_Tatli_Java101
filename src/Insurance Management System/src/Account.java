import java.util.ArrayList;
import java.util.Objects;

public abstract class Account implements Comparable<Account> {

    protected User user;
    private AuthenticationStatus loginStatus = AuthenticationStatus.FAIL; // Başlangıçta FAIL

    public enum AuthenticationStatus {
        SUCCESS, // Represents a successful login
        FAIL     // Represents a failed login
    }

    private ArrayList<Insurance> insuranceList;

    public Account(User user) {
        this.user = user;
    }

    public abstract void showUserInfo();

    public abstract AuthenticationStatus login(User user) throws InvalidAuthenticationException;

    // Login durumunu döndüren fonksiyon
    public AuthenticationStatus getLoginStatus() {
        return loginStatus;
    }

    public abstract void addInsurance();
    // Login durumunu güncelleyen fonksiyon
    protected void setLoginStatus(AuthenticationStatus status) {
        this.loginStatus = status;
    }

    // Comparable interface metodu, User'ın email'ine göre sıralama yapıyoruz
    @Override
    public int compareTo(Account otherAccount) {
        return this.user.getEmail().compareTo(otherAccount.user.getEmail());
    }

    // hashCode metodu
    @Override
    public int hashCode() {
        return Objects.hash(user.getEmail());
    }

    // equals metodu
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Account account = (Account) obj;
        return Objects.equals(user.getEmail(), account.user.getEmail());
    }
}
