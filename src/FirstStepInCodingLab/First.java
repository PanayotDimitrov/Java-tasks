package FirstStepInCodingLab;


import java.util.Scanner;

public class First {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name= scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double apple = Double.parseDouble(scanner.nextLine());

        System.out.printf("My name is: %s%n", name); // %s za string
        System.out.printf("I am %d years old: %n", age); // %d za int
        System.out.printf("apples available: %.2f", apple); //  %f za double  formatirane 2 znaka sled zapetaqta

        System.out.println(name + " " + age + " " + apple);



    }
}
