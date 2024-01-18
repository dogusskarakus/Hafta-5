import java.util.HashSet;
public abstract class Product {
    static HashSet<Brand> brands=new HashSet<>();


    private int id;
    private String name;

    private int price;
    private double discountRate;
    private int stock;

    private Brand brand;
    private int memory;
    private double screenSize;
    private int ram;

    public abstract void menu();
    public abstract void addProduct();
    public abstract void getProducts();
    public abstract void deleteProduct();

    public Product(int id, String name, int price, double discountRate, int stock, Brand brand, int memory, double screenSize, int ram) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
        this.stock = stock;
        this.brand = brand;
        this.memory = memory;
        this.screenSize = screenSize;
        this.ram = ram;
    }
    public Product(){

    }

    //Getter Ve Setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
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

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    //Getter Ve Setter END
}
