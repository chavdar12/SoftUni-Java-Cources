package src;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();
        for (String s : input) {
            stack.push(s);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
