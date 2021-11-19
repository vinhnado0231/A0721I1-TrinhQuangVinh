package ss18_string_and_regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static ss18_string_and_regex.bai_tap.Validate.isValid;

public class ValidateTenLopHoc {
    public static void main(String[] args) {
        System.out.println("Nhập tên lớp để kiẻm tra: ");
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

 class Validate{
    private final static String Class_Regex = "[CPA][0-9]{4}[GHIKLM]$";

    static boolean isValid(String name) {
        Pattern pattern = Pattern.compile(Class_Regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
