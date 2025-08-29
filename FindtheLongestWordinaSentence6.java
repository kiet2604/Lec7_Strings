package Lec7_Strings;
import java.util.Scanner;
public class FindtheLongestWordinaSentence6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split("\\s+");

        String longestWord = "";
        int maxLength = 0;

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }

        System.out.println("Longest word: " + longestWord);
    }
}

