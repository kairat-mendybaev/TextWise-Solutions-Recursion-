import static org.junit.Assert.*;
import org.junit.Test;

public class ReverseWordTest {

    // Test with a regular string
    @Test
    public void testRegularString() {
        String original = "KairatMendybaev";
        String expected = "veabydneMtariaK";
        assertEquals(expected, ReverseWord.reverseString(original));
    }

    // Test with an empty string
    @Test
    public void testEmptyString() {
        String original = "";
        String expected = "";
        assertEquals(expected, ReverseWord.reverseString(original));
    }

    // Test with a single character
    @Test
    public void testSingleCharacter() {
        String original = "A";
        String expected = "A";
        assertEquals(expected, ReverseWord.reverseString(original));
    }

    // Test with a string of two characters
    @Test
    public void testTwoCharacters() {
        String original = "AB";
        String expected = "BA";
        assertEquals(expected, ReverseWord.reverseString(original));
    }

    // Test with a palindrome string
    @Test
    public void testPalindromeString() {
        String original = "madam";
        String expected = "madam";
        assertEquals(expected, ReverseWord.reverseString(original));
    }

    // Test with null input
    @Test
    public void testNullInput() {
        assertNull(ReverseWord.reverseString(null));
    }

    // Test with string that has spaces and special characters
    @Test
    public void testStringWithSpacesAndSpecialCharacters() {
        String original = "Hello, World!";
        String expected = "!dlroW ,olleH";
        assertEquals(expected, ReverseWord.reverseString(original));
    }
}
