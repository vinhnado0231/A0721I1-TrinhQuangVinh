package thi_cuoi_module;

public abstract class Phone {
    public static int count = 0;
    int id;
    String name;
    double price;
    int amount;
    String producer;

    public Phone( String name, double price, int amount, String producer) {
        this.id = ++count;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.producer = producer;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Phone.count = count;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
