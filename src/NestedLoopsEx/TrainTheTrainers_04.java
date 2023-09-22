package NestedLoopsEx;

import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());//броя жури

        int countAllGrades = 0;
        double allGrades = 0;
        String command = scanner.nextLine(); // команда, която е презентация докато не получа "Finish"
        while (!command.equals("Finish")) {
            String presentation = command;

            double sumCurrentGrades = 0;
            for (int i = 1; i <= n; i++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());
                countAllGrades++;
                sumCurrentGrades = sumCurrentGrades + currentGrade;
            }

            allGrades = allGrades + sumCurrentGrades;
            double avgCurrentGrade = sumCurrentGrades / n;
            System.out.printf("%s - %.2f.%n", presentation, avgCurrentGrade);

            command = scanner.nextLine();
        }
        double finalGrade = allGrades / countAllGrades;
        System.out.printf("Student's final assessment is %.2f.", finalGrade);
    }
}