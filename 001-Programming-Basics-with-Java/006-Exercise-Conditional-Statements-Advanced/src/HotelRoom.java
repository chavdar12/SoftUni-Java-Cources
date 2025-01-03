import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double studioPrice = 0;
        double apartmentPrice = 0;
        switch (month) {
            case "May", "October" -> {
                studioPrice = 50;
                apartmentPrice = 65;
                if (nights > 7 && nights <= 14) {
                    studioPrice *= 0.95;
                } else if (nights > 14) {
                    studioPrice *= 0.7;
                    apartmentPrice *= 0.9;
                }
            }
            case "June", "September" -> {
                studioPrice = 75.2;
                apartmentPrice = 68.7;
                if (nights > 14) {
                    studioPrice *= 0.8;
                    apartmentPrice *= 0.9;
                }
            }
            case "July", "August" -> {
                studioPrice = 76;
                apartmentPrice = 77;
                if (nights > 14) {
                    apartmentPrice *= 0.9;
                }
            }
        }
        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice * nights);
        System.out.printf("Studio: %.2f lv.", studioPrice * nights);
    }
}
