package NestedLoops.NestedLoopsMoreExercise.src;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String presentation = scanner.nextLine();
        double totalGrade = 0;
        int count = 0;
        while (!presentation.equals("Finish")) {
            double grade = 0;
            for (int i = 1; i <= n; i++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());
                grade += currentGrade;
            }
            double averageGrade = grade / n;
            System.out.printf("%s - %.2f.%n", presentation, averageGrade);
            totalGrade += averageGrade;
            count++;
            presentation = scanner.nextLine();
        }
        double averageTotalGrade = totalGrade / count;
        System.out.printf("Student's final assessment is %.2f.", averageTotalGrade);
    }
}
