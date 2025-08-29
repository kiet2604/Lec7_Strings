package Lec7_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class CheckforAnagrams4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        if (areAnagrams(str1, str2)) {
            System.out.println("The two strings are Anagrams.");
        } else {
            System.out.println("The two strings are not Anagrams.");
        }
    }

    public static boolean areAnagrams(String s1, String s2) {

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
