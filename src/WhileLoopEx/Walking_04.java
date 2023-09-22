package WhileLoopEx;

import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int goal = 10000;
        int sum =0;

        while (true) {
            String goHome = sc.nextLine();
            if (goHome.equals("Going home")) {
                int num = Integer.parseInt(sc.nextLine());
                sum += num;
                break;
            }
            int num = Integer.parseInt(goHome);
            sum += num;
            if (sum>=goal){
                break;
            }
        }
        if (sum>=goal){
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!",sum-goal);
        } else {
            System.out.printf("%d more steps to reach goal.",(goal - sum) );
        }
    }
}