public class Notebook {
    private int id;
    private double price;
    private int discount;
    private int stock;
    private String name;
    private Brand brand;
    private int memory;
    private double size;
    private int RAM;

    public Notebook(int id, Brand brand, String name, double price, int discount, int stock, int RAM, int memory, double size) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.RAM = RAM;
        this.memory = memory;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                id + " " +
                price + " " +
                discount + " " +
                stock + " " +
                name + " " +
                brand.getName() + " " +
                memory + " " +
                size + " " +
                RAM + " " +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
}
