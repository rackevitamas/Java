import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividersTest {
    Dividers dividerChecker = new Dividers();

    @Test
    public void isNegative(){
        assertThrows(IllegalArgumentException.class, () -> dividerChecker.dividersNumbers(-5), "A negatív szám nem tesztelhető!");
    }

    @Test
    public void isEquals(){
        assertEquals(4, dividerChecker.dividersNumbers(6), "Egyezik!");
    }

    @Test
    public void isNegative2(){
        assertThrows(IllegalArgumentException.class, () -> dividerChecker.dividersNumbers(-10), "A negatív szám nem tesztelhető!");
    }

    @Test
    public void isEquals2(){
        assertEquals(6, dividerChecker.dividersNumbers(12), "Egyezik!");
    }
}