package Lec7_Strings;

public class ReversetheWordsinaSentence {

    public static void main(String[] args) {
        String input = "Java is fun";
        String reversed = reverseWords(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
