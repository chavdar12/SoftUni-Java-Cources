package NestedLoops.NestedLoopsMoreExercise.src;

import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;
        int totalTickets = 0;
        while (!movie.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int currentTickets = 0;
            String ticketType = scanner.nextLine();
            while (!ticketType.equals("End")) {
                switch (ticketType) {
                    case "student":
                        studentTickets++;
                        break;
                    case "standard":
                        standardTickets++;
                        break;
                    case "kid":
                        kidTickets++;
                        break;
                }
                currentTickets++;
                if (currentTickets == freeSeats) {
                    break;
                }
                ticketType = scanner.nextLine();
            }
            totalTickets += currentTickets;
            double percentage = currentTickets * 1.0 / freeSeats * 100;
            System.out.printf("%s - %.2f%% full.%n", movie, percentage);
            movie = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", studentTickets * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardTickets * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", kidTickets * 1.0 / totalTickets * 100);
    }
}
