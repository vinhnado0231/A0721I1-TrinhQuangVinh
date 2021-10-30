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
        char[] Array = myString.toCharArray();
        for (int i = 0; i < myString.length(); i++) {
            if (Array[i] != ' ') {
                myMap.put(Array[i], countChar(Array,i));
            }
        }
        Set<Character> keys = myMap.keySet();
        for (Character key : keys) {
            System.out.println("Kí tự: " + key + ": " + myMap.get(key));
        }
    }

    public static int countChar(char[] array, int index) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[index]) count++;
        }
        return count;


    }
}
