public class ReverseWord {

    // Recursive function to reverse a string
    public static String reverseString(String str) {
        // Base case: if the string is empty or has only one character
        if (str == null || str.length() <= 1) {
            return str;
        }
        // Recursive case: return the last character + reverse of the rest of the string
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        // Example
        String originalString = "KairatMendybaev";
        String reversedString = reverseString(originalString);

        // Print result
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }
}
