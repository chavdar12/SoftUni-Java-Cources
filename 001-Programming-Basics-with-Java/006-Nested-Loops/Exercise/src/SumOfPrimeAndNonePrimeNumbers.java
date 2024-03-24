package NestedLoops.NestedLoopsMoreExercise.src;

import java.util.Scanner;

public class SumOfPrimeAndNonePrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sumPrime = 0;
        int sumNonePrime = 0;

        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            boolean isPrime = true;
            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sumPrime += number;
            } else {
                sumNonePrime += number;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonePrime);
    }
}
