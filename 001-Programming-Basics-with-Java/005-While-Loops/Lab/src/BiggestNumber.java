package WhileLoop.WhileLoopLab.src;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int i = 0;
        while (i < n) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input > max) {
                max = input;
            }
            i++;
        }
        System.out.println(max);
    }
}
