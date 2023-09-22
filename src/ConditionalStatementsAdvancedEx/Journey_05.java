package ConditionalStatementsAdvancedEx;

import java.util.Scanner;

public class Journey_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String vacationType = "";

        if (budget <= 100){

            destination = "Bulgaria";
            if (season.equals("summer")){
                vacationType = "Camp";
                budget = budget * 0.3;
            }
            else if (season.equals("winter")){
                vacationType = "Hotel";
                budget = budget * 0.7;
            }
        }

        else if (budget > 100 && budget <=1000){

            destination = "Balkans";
            if (season.equals("summer")){
                vacationType = "Camp";
                budget = budget * 0.4;
            }
            else if (season.equals("winter")){
                vacationType = "Hotel";
                budget = budget * 0.8;
            }
        } else if (budget > 1000) {
            destination = "Europe";
            vacationType = "Hotel";
            budget = 0.90 * budget;
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", vacationType, budget);


    }
}
