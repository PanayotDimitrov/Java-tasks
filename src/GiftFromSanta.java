import java.util.Scanner;

public class GiftFromSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int s = Integer.parseInt(scanner.nextLine());

        for (int i = n; i >= m; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i != s) {
                System.out.print(i + " ");
            } else if (i == s) {
                break;
            }
        }
    }
}
