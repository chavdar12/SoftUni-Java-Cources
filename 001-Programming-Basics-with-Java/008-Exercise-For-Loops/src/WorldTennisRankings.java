import java.util.Scanner;

public class WorldTennisRankings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());
        int points = startingPoints;
        for (int i = 0; i < tournaments; i++) {
            String result = scanner.nextLine();
            int pointsWon = Integer.parseInt(scanner.nextLine());
            switch (result) {
                case "W" -> points += pointsWon + 2000;
                case "F" -> points += pointsWon + 1200;
                case "SF" -> points += pointsWon + 720;
            }
        }
        System.out.printf("Final points: %d%n", points);
        System.out.printf("Average points: %.0f%n", points * 1.0 / tournaments);
        System.out.printf("%.2f%%%n", (points - startingPoints) * 1.0 / startingPoints * 100);
    }
}
