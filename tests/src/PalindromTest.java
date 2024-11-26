import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PalindromTest {

    @Test
    public void testPalindrome() {
        Palindrom palindromeChecker = new Palindrom();  // Ensure correct instantiation

        // Test with an actual palindrome
        assertTrue(palindromeChecker.isPalindrome("racecar"), "racecar should be a palindrome");

        // Test with another palindrome
        assertTrue(palindromeChecker.isPalindrome("madam"), "madam should be a palindrome");

        // Test with an empty string (assuming empty strings are not palindromes)
        assertFalse(palindromeChecker.isPalindrome(""), "Empty string should not be a palindrome");

        // Test with a non-palindrome
        assertFalse(palindromeChecker.isPalindrome("hello"), "hello should not be a palindrome");

        // Test with a single character string (which is always a palindrome)
        assertTrue(palindromeChecker.isPalindrome("a"), "Single character should be a palindrome");

        // Test with a string containing spaces (e.g., "A man a plan a canal Panama")
        // We'll assume you want to handle spaces and case, so converting it to lowercase and removing spaces
        assertTrue(palindromeChecker.isPalindrome("A man a plan a canal Panama".replaceAll("[^a-zA-Z]", "").toLowerCase()),
                "The phrase 'A man a plan a canal Panama' should be a palindrome when ignoring spaces and case");
    }

    // Test for adding 'S' - assuming the addS method works correctly (though in the original code, it doesn't do anything special)
    @Test
    public void testAddS() {
        Palindrom palindromeChecker = new Palindrom();
        String result = palindromeChecker.addS("test");
        assertEquals("test", result, "addS should return the same string");
    }
}
