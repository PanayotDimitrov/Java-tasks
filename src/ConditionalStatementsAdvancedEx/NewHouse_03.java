package ConditionalStatementsAdvancedEx;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int numberFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        switch (flowers) {
            case "Roses":

                price = numberFlowers * 5;
                if (numberFlowers > 80) {
                    price = price - price * 0.10;
                }

                break;
            case "Dahlias":
                price = numberFlowers * 3.80;
                if (numberFlowers > 90) {
                    price = price - price * 0.15;
                }

                break;
            case "Tulips":
                price = numberFlowers * 2.80;
                if (numberFlowers > 80) {

                    price = price - price* 0.15;
                }

                break;
            case "Narcissus":
                price = numberFlowers * 3;
                if (numberFlowers < 120) {
                    price = price+price * 0.15;
                }

                break;
            case "Gladiolus":
                price = numberFlowers * 2.50;
                if (numberFlowers < 80) {

                    price = price+price * 0.2;
                }

                break;
        }
        double moneyLeft = Math.abs(price-budget);
        if (budget>=price){

            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",numberFlowers, flowers,moneyLeft);

        } else {

            System.out.printf("Not enough money, you need %.2f leva more.",moneyLeft);

        }
    }
}
