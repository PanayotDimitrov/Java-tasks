package ForLoopEx;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        double p1=0;//musala
        double p2=0;//monblan
        double p3=0;//kilimandjaro
        double p4=0;//k2
        double p5=0;//everest

        int sumPeople = 0;


        for (int i = 1; i<=groups; i++) {

            int peopleInGroup = Integer.parseInt(scanner.nextLine());
            sumPeople += peopleInGroup;

            if (peopleInGroup<=5){
                p1+=peopleInGroup;
            } else if (peopleInGroup<=12) {
                p2+=peopleInGroup;
            } else if (peopleInGroup <= 25) {
                p3+=peopleInGroup;
            }else if (peopleInGroup <=40){
                p4+=peopleInGroup;
            }else {
                p5+=peopleInGroup;
            }

        }
        
//        double toPercent = sumPeople * 100;


        System.out.printf("%.2f%%%n",p1/sumPeople*100);
        System.out.printf("%.2f%%%n",p2/sumPeople*100);
        System.out.printf("%.2f%%%n",p3/sumPeople*100);
        System.out.printf("%.2f%%%n",p4/sumPeople*100);
        System.out.printf("%.2f%%%n",p5/sumPeople*100);

    }
}
