package ConditionalStatementsAdvancedEx;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String film = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double income = 0.0;
        
        if("Premiere".equals(film)){
            income= rows*columns*12;
        }
        else if("Normal".equals(film)){
            income= rows*columns*7.50;
        }
        else if("Discount".equals(film)){
            income= rows*columns*5;
        }
        System.out.printf("%.2f leva", income);

    }
}
