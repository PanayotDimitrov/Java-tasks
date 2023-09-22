package WhileLoopLab;

import java.util.Scanner;

public class Sum_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        while (sum < numbers) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum += currentNumber;
        }
        System.out.println(sum);

    }
}
