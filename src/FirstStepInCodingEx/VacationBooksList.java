package FirstStepInCodingEx;

import java.util.Scanner;

public class VacationBooksList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pageNumber = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int hoursNeeded = (pageNumber/pagesPerHour);
        int hoursDay = hoursNeeded/days;

        System.out.println(hoursDay);


    }

}
