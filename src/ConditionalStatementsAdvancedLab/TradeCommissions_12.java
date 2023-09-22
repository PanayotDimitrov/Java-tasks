package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double number = Double.parseDouble(scanner.nextLine());

        switch (town){

            case "Sofia":

                if (0<=number&number<=500){

                    number=0.05*number;
                    System.out.printf("%.2f",number);

                }
                else if (500<number&number<=1000){

                    number=0.07*number;
                    System.out.printf("%.2f",number);

                }
                else if (1000<number&number<=10000){

                    number=0.08*number;
                    System.out.printf("%.2f",number);

                }
                else if (number>10000){

                    number=0.12*number;
                    System.out.printf("%.2f",number);

                }else {
                    System.out.println("error");
                }                break;


            case "Varna":

                if (0<=number&number<=500){

                    number=0.045*number;
                    System.out.printf("%.2f",number);

                }
                else if (500<number&number<=1000){

                    number=0.075*number;
                    System.out.printf("%.2f",number);

                }
                else if (1000<number&number<=10000){

                    number=0.1*number;
                    System.out.printf("%.2f",number);

                }
                else if (number>10000){

                    number=0.13*number;
                    System.out.printf("%.2f",number);

                }else {
                    System.out.println("error");
                }                break;


            case "Plovdiv":

                if (0<=number&number<=500){

                    number=0.055*number;
                    System.out.printf("%.2f",number);

                }
                else if (500<number&number<=1000){

                    number=0.08*number;
                    System.out.printf("%.2f",number);

                }
                else if (1000<number&number<=10000){

                    number=0.12*number;
                    System.out.printf("%.2f",number);

                }
                else if (number>10000){

                    number=0.145*number;
                    System.out.printf("%.2f",number);

                }else {
                    System.out.println("error");
                }                break;

            default:
                System.out.println("error");
                break;
        }
    }
}
