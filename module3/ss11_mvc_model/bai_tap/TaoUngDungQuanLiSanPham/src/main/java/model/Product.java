package model;

public class Product {
    private int id;
    private String name;
    private int amount;
    private double price;
    private String description;

    public Product(int id, String name, int amount, double price, String description) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.description = description;
    }

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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescript() {
        return description;
    }

    public void setDescript(String descript) {
        this.description = descript;
    }
}
