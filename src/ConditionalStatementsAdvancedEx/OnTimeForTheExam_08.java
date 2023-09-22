package ConditionalStatementsAdvancedEx;

import java.util.Scanner;

public class OnTimeForTheExam_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minutesExam = Integer.parseInt(scanner.nextLine());
        int hourCome = Integer.parseInt(scanner.nextLine());
        int minutesCome = Integer.parseInt(scanner.nextLine());

        int totalMinutesExam = hourExam * 60 + minutesExam;
        int totalMinutesCome = hourCome * 60 + minutesCome;

        int difference = Math.abs(totalMinutesExam - totalMinutesCome);

        if(totalMinutesExam < totalMinutesCome){
            System.out.println("Late");
            if (difference>=60){
                int hour = difference / 60;
                int minutes = difference % 60;
                System.out.printf("%d:%02d hours after the start", hour, minutes);
            }else {
                System.out.printf("%d minutes after the start", difference);
            }
        }else if (totalMinutesExam == totalMinutesCome || difference <= 30) {
            System.out.println("On time");
            if(difference >= 1 && difference <= 30) {
                System.out.printf("%d minutes before the start", difference);
            }
        } else {
            System.out.println("Early");
            if (difference >= 60) {
                int hour = difference / 60;
                int min = difference % 60;
                System.out.printf("%d:%02d hours before the start", hour, min);
            } else {
                System.out.printf("%d minutes before the start", difference);
            }

        }
    }
}
