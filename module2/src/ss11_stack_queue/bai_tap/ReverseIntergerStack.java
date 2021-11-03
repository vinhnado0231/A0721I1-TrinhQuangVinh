package ss11_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class ReverseIntergerStack {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng số nguyên");
        int number = input.nextInt();
        int[] Array = new int[number];
        inputArray(Array);
        System.out.println("Mảng sau khi đảo ngược:");
        reverseIntegerArray(myStack, Array);
        showArray(Array);
    }

    public static void inputArray(int[] Array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < Array.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            int value = input.nextInt();
            Array[i] = value;
        }
    }

    public static void reverseIntegerArray(Stack<Integer> stack, int[] array) {
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    public static void showArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + "\t");
        }
    }
}
