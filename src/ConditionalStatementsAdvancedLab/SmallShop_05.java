package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class SmallShop_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        if(town.equals("Sofia") && product.equals("coffee")){
            System.out.printf("%f",quantity*0.50);
        }
        if(town.equals("Plovdiv") && product.equals("coffee")){
            System.out.printf("%f",quantity*0.40);
        }
        if(town.equals("Varna") && product.equals("coffee")){
            System.out.printf("%f",quantity*0.45);
        }

        if(town.equals("Sofia") && product.equals("water")){
            System.out.printf("%f",quantity*0.80);
        }
        if(town.equals("Plovdiv") && product.equals("water")){
            System.out.printf("%f",quantity*0.70);
        }
        if(town.equals("Varna") && product.equals("water")){
            System.out.printf("%f",quantity*0.70);
        }

        if(town.equals("Sofia") && product.equals("beer")){
            System.out.printf("%f",quantity*1.20);
        }
        if(town.equals("Plovdiv") && product.equals("beer")){
            System.out.printf("%f",quantity*1.15);
        }
        if(town.equals("Varna") && product.equals("beer")){
            System.out.printf("%f",quantity*1.10);
        }

        if(town.equals("Sofia") && product.equals("sweets")){
            System.out.printf("%f",quantity*1.45);
        }
        if(town.equals("Plovdiv") && product.equals("sweets")){
            System.out.printf("%f",quantity*1.30);
        }
        if(town.equals("Varna") && product.equals("sweets")){
            System.out.printf("%f",quantity*1.35);
        }

        if(town.equals("Sofia") && product.equals("peanuts")){
            System.out.printf("%f",quantity*1.60);
        }
        if(town.equals("Plovdiv") && product.equals("peanuts")){
            System.out.printf("%f",quantity*1.50);
        }
        if(town.equals("Varna") && product.equals("peanuts")){
            System.out.printf("%f",quantity*1.55);
        }


    }
}
