package WhileLoop.WhileLoopLab.src;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (sum < n) {
            int input = Integer.parseInt(scanner.nextLine());
            sum += input;
        }
        System.out.println(sum);
    }
}
