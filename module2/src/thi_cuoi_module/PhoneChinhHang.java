package thi_cuoi_module;

public class PhoneChinhHang extends Phone {
    int warranty;
    boolean warrantyCoverage;

    public PhoneChinhHang(String name, double price, int amount, String producer, int warranty, boolean warrantyCoverage) {
        super(name, price, amount, producer);
        this.warranty = warranty;
        this.warrantyCoverage = warrantyCoverage;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public boolean isWarrantyCoverage() {
        return warrantyCoverage;
    }

    public void setWarrantyCoverage(boolean warrantyCoverage) {
        this.warrantyCoverage = warrantyCoverage;
    }

    @Override
    public String toString() {
        return "PhoneChinhHang{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", producer='" + producer + '\'' +
                ", warranty=" + warranty +
                ", warrantyCoverage=" + warrantyCoverage +
                '}';
    }
}

