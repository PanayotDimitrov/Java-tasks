package WhileLoopEx;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double herMoney = Double.parseDouble(scanner.nextLine());
        int days = 0;
        int spending = 0;


        while (herMoney < neededMoney&&spending<5) {
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            days++;

            if ("save".equals(command)){
                herMoney += money;
                spending = 0;
            } else if ("spend".equals(command)) {
                herMoney-=money;
                spending += 1;
                if (herMoney < 0){
                    herMoney = 0;
                }
            }
        }
        if (spending == 5){
            System.out.println("You can't save the money.");
            System.out.println(days);
        }
        if (herMoney >= neededMoney){
            System.out.printf("You saved the money for %d days.",days);
        }
    }
}
