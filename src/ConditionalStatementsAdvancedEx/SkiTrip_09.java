package ConditionalStatementsAdvancedEx;

import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//      •	Първи ред - дни за престой - цяло число в интервала [0...365]
//      •	Втори ред - вид помещение - "room for one person", "apartment" или "president apartment"
//      •	Трети ред - оценка - "positive"  или "negative"

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String positiveOrNegative = scanner.nextLine();

        double price = 0;

        switch (roomType) {

            case "room for one person":

                price = (days - 1) * 18;

                break;

            case "apartment":

                price = (days - 1) * 25;

                if (days < 10) {
                    price = price * 0.70;
                } else if (days > 10 & days <= 15) {
                    price = price * 0.65;
                } else {
                    price = price * 0.50;
                }

                break;

            case "president apartment":

                price = (days - 1) * 35;

                if (days < 10) {
                    price = price * 0.90;
                } else if (days > 10 & days <= 15) {
                    price = price * 0.85;
                } else {
                    price = price * 0.80;
                }

                break;

        }
        if (positiveOrNegative.equals("positive")) {
            price = price + (price * 0.25);
        } else if (positiveOrNegative.equals("negative")) {
            price = price - (price * 0.10);
        }
        System.out.printf("%.2f",price);
    }
}
