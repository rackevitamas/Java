import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxTest {
    Max maxChecker = new Max();

    @Test
    public void isEquals(){
        assertEquals(5, maxChecker.maxOfThree(5, 1, 4), "Eredménye egyezik!");
    }

    @Test
    public void isEquals2(){
        assertEquals(7, maxChecker.maxOfThree(5, 7, -5), "Eredménye egyezik!");
    }
}