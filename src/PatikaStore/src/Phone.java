public class Phone {
    private int id;
    private double price;
    private int discount;
    private int stock;
    private String name;
    private Brand brand;
    private int memory;
    private double size;
    private int battery;
    private int RAM;
    private String colour;

    public Phone(int id, Brand brand, String name, double price, int discount, int stock, int memory, double size, int battery, int RAM, String colour) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.memory = memory;
        this.size = size;
        this.battery = battery;
        this.RAM = RAM;
        this.colour = colour;
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
                battery + " " +
                colour + " " +
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

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
