package WhileLoop.WhileLoopMoreExercise.src;

import java.util.Scanner;

public class Steps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = 0;
        int goal = 10000;
        while (steps < goal) {
            String input = scanner.nextLine();
            if (input.equals("Going home")) {
                int stepsToHome = Integer.parseInt(scanner.nextLine());
                steps += stepsToHome;
                break;
            }
            int stepsToWalk = Integer.parseInt(input);
            steps += stepsToWalk;
        }
        if (steps >= goal) {
            System.out.println("Goal reached! Good job!");
        } else {
            System.out.printf("%d more steps to reach goal.", goal - steps);
        }
    }
}
