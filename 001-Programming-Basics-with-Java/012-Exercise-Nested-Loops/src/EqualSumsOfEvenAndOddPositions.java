import java.util.Scanner;

public class EqualSumsOfEvenAndOddPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int i = firstNumber; i <= secondNumber; i++) {
            String currentNumber = String.valueOf(i);
            int sumEven = 0;
            int sumOdd = 0;
            for (int j = 0; j < currentNumber.length(); j++) {
                int currentDigit = Integer.parseInt(String.valueOf(currentNumber.charAt(j)));
                if (j % 2 == 0) {
                    sumEven += currentDigit;
                } else {
                    sumOdd += currentDigit;
                }
            }
            if (sumEven == sumOdd) {
                System.out.print(i + " ");
            }
        }
    }
}
