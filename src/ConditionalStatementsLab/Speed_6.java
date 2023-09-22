package ConditionalStatementsLab;

import java.util.Scanner;

public class Speed_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());

        if (num <=10){
            System.out.println("slow");
        } else if (num>10 && num <=50) {
            System.out.println("average");
        } else if (num>50 && num <=150) {
            System.out.println("fast");
        } else if (num>150&&num<=1000) {
            System.out.println("ultra fast");
        }else {
            System.out.println("extremely fast");
        }

    }
}
