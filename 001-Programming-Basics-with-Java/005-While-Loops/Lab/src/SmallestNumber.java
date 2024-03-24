package WhileLoop.WhileLoopLab.src;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < n) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input < min) {
                min = input;
            }
            i++;
        }
        System.out.println(min);
    }
}
