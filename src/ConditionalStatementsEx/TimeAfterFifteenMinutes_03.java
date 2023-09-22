package ConditionalStatementsEx;

import java.util.Scanner;

public class TimeAfterFifteenMinutes_03 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());



//        23:50

        int totalMinutes = hours * 60 + minutes + 15;


        int finalHours = totalMinutes/60;
        int finalMinutes = totalMinutes % 60;



        if (finalHours>23){

            finalHours=0;
            System.out.printf("%d:%02d", finalHours, finalMinutes);

        }
        else {
            System.out.printf("%d:%02d", finalHours, finalMinutes);

        }


    }
}
