public class Brand {
    private static int id = 0;
    private String name;

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
