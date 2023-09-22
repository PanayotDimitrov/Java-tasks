package FirstStepInCodingEx;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double safetyNylonPrice = 1.50;
        double paintPrice = 14.50;
        double paintThinner = 5.00;
        double bag = 0.40;

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double sumNylon = (nylon + 2) * safetyNylonPrice;
        double sumPaint = (paint + (0.1*paint)) * paintPrice;
        double sumThinner = thinner*paintThinner;

        double sumMaterials = sumNylon+sumThinner+sumPaint+bag;
        double sumWorkers = (sumMaterials*0.3)*hours;
        double finalPrice=sumMaterials+sumWorkers;

        System.out.println("The final price is: " + finalPrice);





    }
}
