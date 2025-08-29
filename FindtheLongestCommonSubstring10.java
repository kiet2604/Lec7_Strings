package Lec7_Strings;

import java.util.Scanner;

public class FindtheLongestCommonSubstring10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        String result = findLongestCommonSubstring(str1, str2);
        System.out.println("Longest common substring: " + result);
    }

    public static String findLongestCommonSubstring(String s1, String s2) {

        if (s1.length() > s2.length()) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }

        String longest = "";

        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j <= s1.length(); j++) {
                String sub = s1.substring(i, j);
                if (s2.contains(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }

        return longest;
    }
}
