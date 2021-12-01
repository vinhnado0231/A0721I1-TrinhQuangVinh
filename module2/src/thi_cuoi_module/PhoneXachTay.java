package thi_cuoi_module;

public class PhoneXachTay extends Phone {
    String region;
    boolean status;

    public PhoneXachTay(String name, double price, int amount, String producer, String region, boolean status) {
        super(name, price, amount, producer);
        this.region = region;
        this.status = status;//true: chua sua chua, false da sua chua
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PhoneXachTay{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", producer='" + producer + '\'' +
                ", region='" + region + '\'' +
                ", status=" + status +
                '}';
    }
}
