import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String serial = scanner.nextLine();
        int episode = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());
        int lunchTime = breakTime / 8;
        int restTime = breakTime / 4;
        int timeLeft = breakTime - lunchTime - restTime;
        if (timeLeft >= episode) {
            System.out.printf("You have enough time to watch %s and left with %d minutes free time.", serial, timeLeft - episode);
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %d more minutes.", serial, episode - timeLeft);
        }
    }
}
