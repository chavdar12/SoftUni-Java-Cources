package FirstStepsInCodingLab.src;

import java.util.Scanner;

public class PreparationOfProject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int countProjects = Integer.parseInt(scan.nextLine());
        int hours = countProjects * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, hours, countProjects);
    }
}
