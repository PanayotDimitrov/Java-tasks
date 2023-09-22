package ConditionalStatementsAdvancedEx;

import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numberPeople = Integer.parseInt(scanner.nextLine());
        double rent = 0;

//        •Цената за наем на кораба през пролетта е 3000 лв.
//        •Цената за наем на кораба през лятото и есента е 4200 лв.
//        •Цената за наем на кораба през зимата е 2600 лв.

//        •	Ако групата е до 6 човека включително  –  отстъпка от 10%.
//        •	Ако групата е от 7 до 11 човека включително  –  отстъпка от 15%.
//        •	Ако групата е от 12 нагоре  –  отстъпка от 25%.
//
//        Рибарите ползват допълнително 5% отстъпка
//        ако са четен брой освен ако не е есен - тогава нямат допълнителна отстъпка.


        
        if ("Spring".equals(season)) {
            rent = 3000;
            if (numberPeople <= 6) {
                rent = rent - rent * 0.10;
            } else if (numberPeople > 7 && numberPeople <= 11) {
                rent = rent - rent * 0.15;
            } else if (numberPeople > 12) {
                rent = rent - rent * 0.25;
            }
            if (numberPeople % 2 == 0) {

                rent = rent - rent * 0.05;

            }
        } else if ("Summer".equals(season)) {
            rent = 4200;
            if (numberPeople <= 6) {
                rent = rent - rent * 0.10;
            } else if (numberPeople > 7 && numberPeople <= 11) {
                rent = rent - rent * 0.15;
            } else if (numberPeople > 12) {
                rent = rent - rent * 0.25;
            }
            if (numberPeople % 2 == 0) {

                rent = rent - rent * 0.05;

            }
        } else if ("Autumn".equals(season)) {
            rent = 4200;
            if (numberPeople <= 6) {
                rent = rent - rent * 0.10;
            } else if (numberPeople > 7 && numberPeople <= 11) {
                rent = rent - rent * 0.15;
            } else if (numberPeople > 12) {
                rent = rent - rent * 0.25;
            }
        } else if ("Winter".equals(season)) {
            rent = 2600;
            if (numberPeople <= 6) {
                rent = rent - rent * 0.10;
            } else if (numberPeople > 7 && numberPeople <= 11) {
                rent = rent - rent * 0.15;
            } else if (numberPeople > 12) {
                rent = rent - rent * 0.25;
            }
            if (numberPeople % 2 == 0) {

                rent = rent - rent * 0.05;

            }
        }

        double moneyLeft = Math.abs(budget-rent);

        if (budget>=rent){

            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);

        }
        else {

            System.out.printf("Not enough money! You need %.2f leva.",moneyLeft);

        }

    }
}
