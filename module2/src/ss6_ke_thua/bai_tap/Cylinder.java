package ss6_ke_thua.bai_tap;

public class Cylinder extends Circle{
    double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder()
    {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume()
    {
        return getArea()*height;
    }
}
