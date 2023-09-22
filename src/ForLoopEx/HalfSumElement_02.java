package ForLoopEx;

import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 1; i<= number; i++  ){

            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum += currentNumber;

            if(currentNumber>maxNumber){
                maxNumber = currentNumber;
            }


        }
        sum = sum-maxNumber;
        int diff = Math.abs(sum-maxNumber);

        if (sum == maxNumber){
            System.out.println("Yes");
            System.out.printf("Sum = %d", maxNumber);
        }else {

            System.out.println("No");
            System.out.printf("Diff = %d",diff);

        }

    }
}
