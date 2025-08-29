package Lec7_Strings;

import java.util.Scanner;

public class StringCompression3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            System.out.println("Compressed String: ");
            return;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        compressed.append(input.charAt(input.length() - 1)).append(count);

        System.out.println("Compressed String: " + compressed.toString());
    }
}
