package FirstStepInCodingEx;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberPens = Integer.parseInt(scanner.nextLine());
        int numberMarkers = Integer.parseInt(scanner.nextLine());
        int litersDrugNeeded = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double priceBeforeDiscount = numberPens*5.80+numberMarkers*7.20+litersDrugNeeded*1.20;

        double finalPrice = priceBeforeDiscount-(priceBeforeDiscount*discount/100);

        System.out.println(finalPrice);


    }
}
