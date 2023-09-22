package FirstStepInCodingEx;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double chickenMenuPrice = 10.35;
        double fishMenuPrice = 12.40;
        double vegetarianMenuPrice = 8.15;
        double delivery = 2.50;

        int chickenMenuOrder = Integer.parseInt(scanner.nextLine());
        int fishMenuOrder = Integer.parseInt(scanner.nextLine());
        int vegetarianMenuOrder = Integer.parseInt(scanner.nextLine());

        double sumChickenMenuPrice = chickenMenuPrice*chickenMenuOrder;
        double sumFishMenuPrice = fishMenuPrice*fishMenuOrder;
        double sumVegetarianMenuPrice = vegetarianMenuPrice*vegetarianMenuOrder;
        double dessertSum=(sumFishMenuPrice+sumChickenMenuPrice+sumVegetarianMenuPrice)*0.2;

        double finalPrice=sumChickenMenuPrice+sumFishMenuPrice+sumVegetarianMenuPrice+dessertSum+delivery;

        System.out.println("The final price is: "+finalPrice);




    }

}
