package ForLoopEx;

import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double pointsAcademy = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());

        double allPoints = pointsAcademy;

        for (int i = 1; i <= people; i++){

            String name = scanner.nextLine();
            double pointsName = Double.parseDouble(scanner.nextLine());

            int length = name.length();
            double calculatedPoints = length * pointsName / 2;
            allPoints = allPoints + calculatedPoints;
            if (allPoints>1250.5){
                break;
            }
        }

        double neededPoints = Math.abs(1250.5 - allPoints);
        if (allPoints >= 1250.5){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",actorName,allPoints);
        }else {
            System.out.printf("Sorry, %s you need %.1f more!",actorName,neededPoints);
        }

    }
}
