package WhileLoop.WhileLoopMoreExercise.src;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int cakeSize = width * length;
        int pieces = 0;
        while (pieces < cakeSize) {
            String input = scanner.nextLine();
            if (input.equals("STOP")) {
                break;
            }
            int currentPieces = Integer.parseInt(input);
            pieces += currentPieces;
        }
        if (pieces >= cakeSize) {
            System.out.printf("No more cake left! You need %d pieces more.", pieces - cakeSize);
        } else {
            System.out.printf("%d pieces are left.", cakeSize - pieces);
        }
    }
}
