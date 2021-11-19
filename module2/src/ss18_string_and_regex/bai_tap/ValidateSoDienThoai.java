package ss18_string_and_regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static ss18_string_and_regex.bai_tap.Validate1.isValid;

public class ValidateSoDienThoai {
    public static void main(String[] args) {
        System.out.println("Nhập số điện thoại: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        if (isValid(str))
        {
            System.out.println("Hợp lệ");
        }
        else {
            System.out.println("Không hợp lệ");
        }
    }
}

class Validate1{
    private final static String Phone_Regex = "^[(][0-9]{2}[)][-][(][0-9]{10}[)]$";

    static boolean isValid(String name) {
        Pattern pattern = Pattern.compile(Phone_Regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
