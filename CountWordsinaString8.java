package Lec7_Strings;
import java.util.Scanner;
public class CountWordsinaString8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.trim().split("\\s+");

        int wordCount = sentence.trim().isEmpty() ? 0 : words.length;

        System.out.println("The number of words in the string is: " + wordCount);
    }
}

