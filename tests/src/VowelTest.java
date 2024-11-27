import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelTest {
    Vowel vChecker = new Vowel();

    @Test
    public void isTrue(){
        assertTrue(vChecker.isVowel('a'), "Az a magánhangzó: igaz");
    }

    @Test
    public void isTrue2(){
        assertTrue(vChecker.isVowel('E'), "Az E magánhangzó: igaz");
    }

    @Test
    public void isFalse(){
        assertFalse(vChecker.isVowel('B'), "Az B magánhangzó: hamis");
    }

    @Test
    public void isFalse2(){
        assertFalse(vChecker.isVowel('h'), "Az h magánhangzó: hamis");
    }
}