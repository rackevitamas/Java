import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    Anagram anagramChecker = new Anagram();

    @Test
    public void AnagramPositive(){
        assertTrue(anagramChecker.isAnagram("listen", "silent"), "\"listen\" should be an anagram, cz it would be \"silent\"");
    }

    @Test
    public void AnagramPositiveAnother(){
        assertTrue(anagramChecker.isAnagram("alszik", "szikla"), "\"alszik\" should be an anagram, cz it would be \"szikla\"");
    }

    @Test
    public void AnagramNegative(){
        assertFalse(anagramChecker.isAnagram("hello", "heloh"), "not anagram!");
    }

    @Test
    public void AnagramNegativeAnother(){
        assertFalse(anagramChecker.isAnagram("pirate", "great"), "not anagram!");
    }
}