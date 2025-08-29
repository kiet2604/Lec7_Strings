package Lec7_Strings;
import java.util.Scanner;
public class FormataNumberString9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number string: ");
        String number = scanner.nextLine();

        StringBuilder formatted = new StringBuilder(number);

        int insertPosition = formatted.length() - 3;
        while (insertPosition > 0) {
            formatted.insert(insertPosition, ",");
            insertPosition -= 3;
        }

        System.out.println("Formatted number: " + formatted.toString());
    }
}
