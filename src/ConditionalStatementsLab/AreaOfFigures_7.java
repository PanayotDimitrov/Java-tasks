package ConditionalStatementsLab;

import java.util.Scanner;

public class AreaOfFigures_7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String figureType=scanner.nextLine();

        if(figureType.equals("square")){

            double squareSide=Double.parseDouble(scanner.nextLine());

            double area=squareSide*squareSide;
            System.out.printf("%.3f",area);

        }

        if(figureType.equals("rectangle")){

            double rectSide1=Double.parseDouble(scanner.nextLine());
            double rectSide2=Double.parseDouble(scanner.nextLine());

            double area = rectSide1*rectSide2;
            System.out.printf("%.3f",area);

        }

        if(figureType.equals("circle")){

            double radios=Double.parseDouble(scanner.nextLine());
            double area = Math.PI*(radios*radios);
            System.out.printf("%.3f",area);

        }

        if(figureType.equals("triangle")){

            double triangleSide=Double.parseDouble(scanner.nextLine());
            double triangleHeight=Double.parseDouble(scanner.nextLine());

            double area = (triangleHeight*triangleSide)/2;
            System.out.printf("%.3f",area);

        }

    }
}
