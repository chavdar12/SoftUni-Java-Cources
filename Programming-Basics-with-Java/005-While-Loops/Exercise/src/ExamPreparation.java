package WhileLoop.WhileLoopMoreExercise.src;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int badGrades = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int badCounter = 0;
        double sum = 0;
        String lastProblem = "";
        boolean isFailed = false;
        while (badCounter < badGrades) {
            String problem = scanner.nextLine();
            if (problem.equals("Enough")) {
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                badCounter++;
            }
            sum += grade;
            counter++;
            lastProblem = problem;
        }
        if (badCounter == badGrades) {
            isFailed = true;
        }
        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", badGrades);
        } else {
            System.out.printf("Average score: %.2f%n", sum / counter);
            System.out.printf("Number of problems: %d%n", counter);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
