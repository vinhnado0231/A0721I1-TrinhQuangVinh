package ss4_lop_va_doi_tuong_trong_java.bai_tap;

public class Fan {
    int SLOW = 1;
    int MEDIUM = 2;
    int FAST = 3;
    private int speed;
    boolean status;
    private double radius;
    private String color;

    public Fan() {
        this.speed = SLOW;
        this.status = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean checkStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        String result;
        if (checkStatus()) {
            result = "Speed: " + getSpeed() + ",Color: " + getColor() + ", Radius:" + getRadius() + ", Fan is on";
        } else {
            result = "Color: " + getColor() + ", Radius:" + getRadius() + ", Fan is off";
        }
        return result;
    }
}
