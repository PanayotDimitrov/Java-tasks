package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class FruitShop_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        switch (fruit) {

            case "banana":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")
                        || day.equals("Thursday") || day.equals("Friday")) {
                    System.out.printf("%.2f", quantity * 2.50);
                }
                else if (day.equals("Saturday") || day.equals("Sunday")) {
                    System.out.printf("%.2f", quantity * 2.70);
                }else {
                    System.out.println("error");
                }
                break;
            case "apple":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")
                        || day.equals("Thursday") || day.equals("Friday")) {
                    System.out.printf("%.2f", quantity * 1.20);
                }
                else if (day.equals("Saturday") || day.equals("Sunday")) {
                    System.out.printf("%.2f", quantity * 1.25);
                }else {
                    System.out.println("error");
                }
                break;
            case "orange":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")
                        || day.equals("Thursday") || day.equals("Friday")) {
                    System.out.printf("%.2f", quantity * 0.85);
                }
                else if (day.equals("Saturday") || day.equals("Sunday")) {
                    System.out.printf("%.2f", quantity * 0.90);
                }else {
                    System.out.println("error");
                }
                break;
            case "grapefruit":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")
                        || day.equals("Thursday") || day.equals("Friday")) {
                    System.out.printf("%.2f", quantity * 1.45);
                }
                else if (day.equals("Saturday") || day.equals("Sunday")) {
                    System.out.printf("%.2f", quantity * 1.60);
                }else {
                    System.out.println("error");
                }
                break;
            case "kiwi":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")
                        || day.equals("Thursday") || day.equals("Friday")) {
                    System.out.printf("%.2f", quantity * 2.70);
                }
                else if (day.equals("Saturday") || day.equals("Sunday")) {
                    System.out.printf("%.2f", quantity * 3.00);
                }else {
                    System.out.println("error");
                }
                break;
            case "pineapple":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")
                        || day.equals("Thursday") || day.equals("Friday")) {
                    System.out.printf("%.2f", quantity * 5.50);
                }
                else if (day.equals("Saturday") || day.equals("Sunday")) {
                    System.out.printf("%.2f", quantity * 5.60);
                }else {
                    System.out.println("error");
                }
                break;
            case "grapes":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")
                        || day.equals("Thursday") || day.equals("Friday")) {
                    System.out.printf("%.2f", quantity * 3.85);
                }
                else if (day.equals("Saturday") || day.equals("Sunday")) {
                    System.out.printf("%.2f", quantity * 4.20);
                }else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;

        }
    }
}
