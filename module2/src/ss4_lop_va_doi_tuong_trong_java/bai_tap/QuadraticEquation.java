package ss4_lop_va_doi_tuong_trong_java.bai_tap;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    private double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    private double getRoot1() {
        return (-this.b + Math.sqrt(getDiscriminant())) / 2 * this.a;
    }

    private double getRoot2() {
        return (-this.b - Math.sqrt(getDiscriminant())) / 2 * this.a;
    }

    public void calculation() {
        if (this.a == 0) {
            System.out.println("Đây không phải phương trình bậc 2");
        } else if (getDiscriminant() == 0) {
            System.out.printf("Phương trình có nghiệm kép x1=x2= %f", getRoot1());
        } else if (getDiscriminant() > 0) {
            System.out.println("Phương trình có 2 nghiệm phân biệt:");
            System.out.printf("x1= %f  x2= %f", getRoot1(), getRoot2());
        } else{
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
