package WhileLoopEx;

import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int volume = w * l * h;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Done")) {
                System.out.println(volume + " Cubic meters left.");
                break;
            }
            int box = Integer.parseInt(input);
            volume -= box;
            if (volume < 0) {
                System.out.printf(
                        "No more free space! You need %d Cubic meters more.",
                        Math.abs(volume));
                break;
            }
        }
    }
}