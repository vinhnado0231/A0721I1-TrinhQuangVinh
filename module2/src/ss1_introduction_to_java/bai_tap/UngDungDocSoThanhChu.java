package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập số:");
        int number = scanner.nextInt();
        String result = tranfer(number);
        if (number > 999 || number < 0) {
            result = "out of ability";
        }
        System.out.printf("\nTên của số %d là: %s ", number, result);
    }

    static String tranfer(int num) {
        String result;
        int hundreds = num / 100;
        num %= 100;
        int tens = num / 10;
        num %= 10;
        String hundred, ten, one;
        hundred = switch (hundreds) {
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            default -> "";
        };

        ten = switch (tens) {
            case 2 -> "twenty";
            case 3 -> "thirty";
            case 4 -> "fourty";
            case 5 -> "fifty";
            case 6 -> "sixty";
            case 7 -> "seventy";
            case 8 -> "eightty";
            case 9 -> "ninety";
            default -> "";
        };

        if (tens == 1) {
            one = switch (num) {
                case 0 -> "ten";
                case 1 -> "elevent";
                case 2 -> "twelve";
                case 3 -> "thirteen";
                case 4 -> "fourteen";
                case 5 -> "fifteen";
                case 6 -> "sixteen";
                case 7 -> "seventeen";
                case 8 -> "eighteen";
                case 9 -> "nineteen";
                default -> "";
            };
        } else {
            one = switch (num) {
                case 0 -> "zero";
                case 1 -> "one";
                case 2 -> "two";
                case 3 -> "three";
                case 4 -> "four";
                case 5 -> "five";
                case 6 -> "six";
                case 7 -> "seven";
                case 8 -> "eight";
                case 9 -> "nine";
                default -> "";
            };
        }

        if (hundreds == 0) {
            result = ten + " " + one;
        } else if (tens == 0 && num == 0) {
            result = hundred + " hundred ";
        } else {
            result = hundred + " hundred and " + ten + " " + one;
        }
        return result;
    }
}
