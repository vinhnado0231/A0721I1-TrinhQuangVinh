package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Print the rectangle");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                }
                case 2 -> {
                    System.out.println("Print the square triangle");
                    for (int i = 1; i < 6; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    System.out.println();
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (j < i) {
                                System.out.print("  ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();

                    for (int i = 5; i >= 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    for (int i = 5; i >=0; i--) {
                        for (int j = 0; j < 5; j++) {
                            if (j < i) {
                                System.out.print("  ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.println();
                    }
                }
                case 3 -> {
                    System.out.println("Print isosceles triangle");
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 6; j++) {
                            if (j < i + 1) {
                                System.out.print(" ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.println();
                    }
                }
                case 0 -> System.exit(0);
                default -> System.out.println("No choice!");
            }
        }

    }
}
