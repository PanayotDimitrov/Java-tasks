package ConditionalStatementsEx;

import java.util.Scanner;

public class GodzillaVsKong_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget=Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double dressPrice = Double.parseDouble(scanner.nextLine());

        double decorSum = budget*0.10;
        double dressPriceSum=people*dressPrice;

        if(people>150){

            dressPriceSum=dressPriceSum-(dressPriceSum*0.10);

        }
        double allMoneyNeeded=decorSum+dressPriceSum;
        double moneyLeft=budget-allMoneyNeeded;



        moneyLeft=Math.abs(moneyLeft);

//        System.out.println("nujni pari "+allMoneyNeeded);
//        System.out.println("ostavashti pari "+moneyLeft);

        if(allMoneyNeeded<budget){

            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",moneyLeft);

        }
        if(allMoneyNeeded>budget) {

            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",moneyLeft);

        }

    }

}
