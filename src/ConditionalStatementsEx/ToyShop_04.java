package ConditionalStatementsEx;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//            •	Пъзел - 2.60 лв.
//            •	Говореща кукла - 3 лв.
//            •	Плюшено мече - 4.10 лв.
//            •	Миньон - 8.20 лв.
//            •	Камионче - 2 лв.

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzlesCount=Integer.parseInt(scanner.nextLine());
        int dollCount=Integer.parseInt(scanner.nextLine());
        int bearCount=Integer.parseInt(scanner.nextLine());
        int minionsCount=Integer.parseInt(scanner.nextLine());
        int trucksCount=Integer.parseInt(scanner.nextLine());


        double toysSumPrices=puzzlesCount*2.60 + dollCount*3 + bearCount*4.10 + minionsCount*8.20+trucksCount*2;
        double toysSum=puzzlesCount+dollCount+bearCount+minionsCount+trucksCount;

        if(toysSum>=50){

            toysSumPrices=toysSumPrices-(0.25*toysSumPrices);

        }
        double rent = 0.10*toysSumPrices;

        double profit = toysSumPrices-rent;

        if(profit>tripPrice){

            double moneyLeft = profit-tripPrice;

            System.out.printf("Yes! %.2f lv left.",moneyLeft);

        }else if(profit<tripPrice){

            double moneyLeft = profit-tripPrice;
            System.out.printf("Not enough money! %.2f lv needed.",Math.abs(moneyLeft));

        }



    }
}
