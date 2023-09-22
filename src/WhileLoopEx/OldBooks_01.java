package WhileLoopEx;

import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine();
        int count = 0;
        boolean isFound = false;

        String text = scanner.nextLine();
        while (!text.equals("No More Books")) {
            if (text.equals(bookName)) {
                isFound = true;
                break;
            }
            count++;
            text = scanner.nextLine();
        }

        if (isFound){
            System.out.printf("You checked %d books and found it.",count);
        }else {
            System.out.printf("The book you search is not here!\nYou checked %d books.",count);
        }
    }
}
//o	"The book you search is not here!"
//o	"You checked {брой} books."
//•	Ако открие книгата си се отпечатва един ред:
//o	"You checked {брой} books and found it."