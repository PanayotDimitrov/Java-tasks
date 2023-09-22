package NestedLoopsEx;

import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStandard = 0;
        int countStudent = 0;
        int countKid = 0;
        int countTotalTickets = 0;
        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
            String movie = command;
            int availableSeats = Integer.parseInt(scanner.nextLine());

            int countCurrentTickets = 0;
            String ticketType = scanner.nextLine();
            while (!ticketType.equals("End")) {
                countCurrentTickets++;
                countTotalTickets++;

                if(ticketType.equals("student")) {
                    countStudent++;
                } else if (ticketType.equals("standard")) {
                    countStandard++;
                } else if (ticketType.equals("kid")) {
                    countKid++;
                }

                if(countCurrentTickets >= availableSeats) {
                    break;
                }
                ticketType= scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n",movie, countCurrentTickets * 1.0 / availableSeats * 100);


            command = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", countTotalTickets);
        System.out.printf("%.2f%% student tickets.%n", countStudent * 1.0 / countTotalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", countStandard * 1.0 / countTotalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", countKid * 1.0 / countTotalTickets * 100);

    }
}