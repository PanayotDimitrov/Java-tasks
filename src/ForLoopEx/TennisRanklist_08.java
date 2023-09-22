package ForLoopEx;

import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int turniri = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());

        int wins = 0;
        double sumPoints = 0;


        for (int i = 1; i <= turniri; i++) {
            String etap = scanner.next();
            switch (etap) {
                case "W":
                    sumPoints+=2000;
                    startPoints+=2000;
                    wins++;
                    break;
                case "F":
                    sumPoints+=1200;
                    startPoints+=1200;
                    break;
                case "SF":
                    sumPoints+=720;
                    startPoints+=720;
                    break;
            }

        }

        double averagePoints = Math.floor(sumPoints/turniri);
        double winPercent = wins * 1.0 / turniri * 100;


        System.out.printf("Final points: %d\n",startPoints);
        System.out.printf("Average points: %.0f\n",averagePoints);
        System.out.printf("%.2f%%\n",winPercent);
    }
}
