package Model;

import java.util.Date;

public class MatBang {
    String id;
    String status;
    double area;
    int floor;
    String type;
    double  price;
    String dateStart;
    String dateEnd;

    public MatBang(String id, String status, double area, int floor, String type, double price, String dateStart, String dateEnd) {
        this.id = id;
        this.status = status;
        this.area = area;
        this.floor = floor;
        this.type = type;
        this.price = price;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return Double.toString(price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }
}
