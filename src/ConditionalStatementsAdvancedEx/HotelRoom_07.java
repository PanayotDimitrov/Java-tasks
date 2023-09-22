package ConditionalStatementsAdvancedEx;

import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        String roomType = "";

        double resultStudio = 0.0;
        double resultApartment = 0.0;

        switch (month) {

            case "May":

                resultApartment = nights * 65;
                resultStudio = nights * 50;

                if (nights > 7 && nights < 14) {
                    resultStudio = resultStudio * 0.95;
                } else if (nights > 14) {
                    resultStudio = resultStudio * 0.70;
                    resultApartment = resultApartment* 0.9;
                }




                break;

            case "June":

                resultApartment = nights * 68.70;
                resultStudio = nights * 75.20;

                if (nights > 14) {
                    resultStudio = resultStudio * 0.80;
                    resultApartment = resultApartment* 0.9;
                }

                break;

            case "July":

                resultApartment = nights * 77;
                resultStudio = nights * 76;
                if(nights > 14){
                    resultApartment = resultApartment * 0.90;
                }

                break;

            case "August":

                resultApartment = nights * 77;
                resultStudio = nights * 76;
                if(nights > 14){
                    resultApartment = resultApartment * 0.90;
                }

                break;

            case "September":

                resultApartment = nights * 68.70;
                resultStudio = nights * 75.20;

                if (nights > 14) {
                    resultStudio = resultStudio * 0.80;
                    resultApartment = resultApartment * 0.90;
                }

                break;

            case "October":

                resultApartment = nights * 65;
                resultStudio = nights * 50;

                if (nights > 7 && nights < 14) {
                    resultStudio = resultStudio * 0.95;
                } else if (nights > 14) {
                    resultStudio = resultStudio * 0.70;
                    resultApartment = resultApartment * 0.90;
                }

                break;


        }
        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.",resultApartment,resultStudio);


    }
}
