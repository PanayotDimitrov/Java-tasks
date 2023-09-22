package FirstStepInCodingEx;

import java.util.Scanner;
public class BasketballEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tax = Integer.parseInt(scanner.nextLine());

        double shoes = tax - (0.4*tax);

        double shirt = shoes - (0.2*shoes);

        double ball = 0.25 * shirt;

        double accessories = 0.20 * ball;

        double sum = shoes+shirt+ball+accessories+tax;

        System.out.println(sum);






    }
}
