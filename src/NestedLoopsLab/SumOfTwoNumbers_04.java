package NestedLoopsLab;

import java.util.Scanner;


//Напишете програма която проверява всички възможни комбинации от двойка числа в интервала от две дадени числа.
//        На изхода се отпечатва, коя поред е комбинацията чиито сбор от числата е равен на дадено магическо число.
//        Ако няма нито една комбинация отговаряща на условието се отпечатва съобщение, че не е намерено.
public class SumOfTwoNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intervalStart = Integer.parseInt(scanner.nextLine());
        int intervalEnd = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int combination = 0;
        boolean isMagicNumber = false;
        int x1 = 0;
        int x2 = 0;



        for (int i = intervalStart; i <= intervalEnd; i++) {

            for (int j = intervalStart; j <= intervalEnd; j++) {

                combination++;

                if (i + j == magicNumber) {
                    isMagicNumber = true;
                    x1=i;
                    x2=j;
                    break;
                }
            }
            if (isMagicNumber){
                break;
            }
        }
        if (isMagicNumber) {
            System.out.printf("Combination N:%d (%d + %d = %d)\n", combination, x1, x2, magicNumber);
        }else {
            System.out.printf("%d combinations - neither equals %d", combination, magicNumber);
        }
    }
}
//
//System.out.printf("Combination N:%d (%d + %d = %d)\n", combination, i, j, magicNumber);
//        System.out.printf("%d combinations - neither equals %d", combination, magicNumber);
