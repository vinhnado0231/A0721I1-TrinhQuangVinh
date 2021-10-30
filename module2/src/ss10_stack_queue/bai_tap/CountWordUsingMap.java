package ss10_stack_queue.bai_tap;

import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CountWordUsingMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TreeMap<Character, Integer> myMap = new TreeMap<>();
        System.out.println("Nhập chuỗi : ");
        String myString = input.nextLine();
        myString = myString.toLowerCase(Locale.ROOT);
        char[] charArray = myString.toCharArray();
        for (int i = 0; i < myString.length(); i++) {
            if (charArray[i] != ' ') {
                int value = count(charArray, i);
                myMap.put(charArray[i], value);
            }
        }
        Set<Character> keys = myMap.keySet();
        for (Character key : keys) {
            System.out.println("Key: " + key + ": " + myMap.get(key));
        }
    }

    public static int count(char[] arr, int index) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[index]) count++;
        }
        return count;


    }
}
