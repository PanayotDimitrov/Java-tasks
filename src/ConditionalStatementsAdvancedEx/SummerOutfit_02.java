package ConditionalStatementsAdvancedEx;

import java.util.Scanner;

public class SummerOutfit_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
        String outfit = "";
        String shoes = "";

        if("Morning".equals(time)){

            if(degrees>=10 && degrees <=18){
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            }
            else if(degrees>18&&degrees<=24){
                outfit = "Shirt";
                shoes = "Moccasins";

            }
            else{
                outfit = "T-Shirt";
                shoes = "Sandals";

            }

        }
        else if("Afternoon".equals(time)){

            if(degrees>=10 && degrees <=18){
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            else if(degrees>18&&degrees<=24){
                outfit = "T-Shirt";
                shoes = "Sandals";

            }
            else{
                outfit = "Swim Suit";
                shoes = "Barefoot";

            }

        }
        else if("Evening".equals(time)){

            if(degrees>=10 && degrees <=18){
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            else if(degrees>18&&degrees<=24){
                outfit = "Shirt";
                shoes = "Moccasins";

            }
            else{
                outfit = "Shirt";
                shoes = "Moccasins";

            }

        }
        System.out.printf("It's %d degrees, get your %s and %s.",degrees,outfit,shoes);

    }
}
