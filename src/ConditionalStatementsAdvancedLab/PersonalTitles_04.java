package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class PersonalTitles_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();

        if(age>=16 && sex.equals("m")){

            System.out.println("Mr.");

        }
        if(age<16 && sex.equals("m")){

            System.out.println("Master");

        }
        if(age>=16 && sex.equals("f")){

            System.out.println("Ms.");

        }
        if(age<16 && sex.equals("f")){

            System.out.println("Miss");

        }

    }
}
