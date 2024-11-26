public class Palindrom {

    // Method to check if the string is a palindrome
    public boolean isPalindrome(String szo) {
        int length = szo.length();  // Using String's length() method here
        for (int i = 0; i < length / 2; i++) {  // Check up to the middle of the string
            if (szo.charAt(i) != szo.charAt(length - 1 - i)) {
                return false;  // Return false if characters do not match
            }
        }
        return true;  // Return true if no mismatches were found
    }

    // Optional addS method (not necessary for palindrome check but provided in original)
    public String addS(String szo) {
        if (szo.length() <= 0) {
            throw new IllegalArgumentException("String cannot be empty.");
        }
        return szo;  // Simply returns the string, no modification
    }

    public static void main(String[] args) {
        Palindrom palindromeChecker = new Palindrom();
        String testString = "racecar";
        System.out.println("Is \"" + testString + "\" a palindrome? " + palindromeChecker.isPalindrome(testString));
    }
}
