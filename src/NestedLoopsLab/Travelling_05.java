package NestedLoopsLab;

import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {

            double minBudget = Double.parseDouble(scanner.nextLine());
            double myMoney = 0;
            while (myMoney<minBudget) {
                double savedMoney = Double.parseDouble(scanner.nextLine());
                myMoney += savedMoney;
            }

            System.out.printf("Going to %s!\n",destination);

            destination = scanner.nextLine();
        }

    }
}
