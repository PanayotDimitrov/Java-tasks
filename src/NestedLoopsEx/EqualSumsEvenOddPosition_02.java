package NestedLoopsEx;

import java.util.Scanner;

public class EqualSumsEvenOddPosition_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int i = firstNumber; i <= secondNumber;i++){
            String currentNum = ""+ i;
            int oddSum = 0;
            int evenSum = 0;

            for (int j = 0; j < currentNum.length();j++){
                int currentDigit = Integer.parseInt(""+currentNum.charAt(j));
                if (j%2 ==0) {
                    evenSum+=currentDigit;
                }else {
                    oddSum += currentDigit;
                }
            }
            if (oddSum==evenSum){
                System.out.print(i+ " ");
            }
        }

    }
}
