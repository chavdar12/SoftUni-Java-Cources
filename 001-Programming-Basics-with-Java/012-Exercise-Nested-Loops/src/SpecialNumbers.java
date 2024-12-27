import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int current;
        boolean isSpecial = false;

        for (int i = 1111; i <= 9999; i++) {
            String currentNumber = String.valueOf(i);
            for (int j = 0; j < currentNumber.length(); j++) {
                current = Integer.parseInt(String.valueOf(currentNumber.charAt(j)));
                if (current == 0) {
                    break;
                }
                if (n % current == 0) {
                    isSpecial = true;
                } else {
                    isSpecial = false;
                    break;
                }
            }
            if (isSpecial) {
                System.out.print(i + " ");
            }
        }
    }
}
