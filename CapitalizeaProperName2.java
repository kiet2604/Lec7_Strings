package Lec7_Strings;

import java.util.Scanner;

public class CapitalizeaProperName2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a full name: ");
        String input = scanner.nextLine();

        String[] words = input.trim().split("\\s+");

        StringBuilder normalized = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {

                String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                normalized.append(capitalized).append(" ");
            }
        }

        System.out.println("Normalized Name: " + normalized.toString().trim());
    }

}
