public class HomeAdress implements Address{

    private String home;

    public HomeAdress(String home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return "HomeAdress{" +
                "home='" + home + '\'' +
                '}';
    }
}
