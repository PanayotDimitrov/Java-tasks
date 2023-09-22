package FirstStepInCodingEx;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());



        int volume = length*width*height;

        double volumeInLiters=volume*0.001;

        double litersNeeded=volumeInLiters-(volumeInLiters*percent/100);

        System.out.println(litersNeeded);

    }
}
