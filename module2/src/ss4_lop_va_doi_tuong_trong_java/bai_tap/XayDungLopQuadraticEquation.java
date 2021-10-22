package ss4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class XayDungLopQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        System.out.println("Nhập phương trình bậc 2:");
        System.out.print("a= ");
        a = input.nextDouble();
        System.out.print("b= ");
        b = input.nextDouble();
        System.out.print("c= ");
        c = input.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        equation.calculation();
    }
}
