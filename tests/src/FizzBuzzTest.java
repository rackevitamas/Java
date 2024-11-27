import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    FizzBuzz checkFb = new FizzBuzz();

    @Test
    public void isEquals(){
        assertEquals("FizzBuzz", checkFb.fB(15), "Eredménye egyezik!");
    }

    @Test
    public void isEquals2(){
        assertEquals("Fizz", checkFb.fB(9), "Eredménye egyezik!");
    }

    @Test
    public void isEqual3(){
        assertEquals("Buzz", checkFb.fB(10), "Eredménye egyezik!");
    }

    @Test
    public void isEquals4(){
        assertEquals(8, checkFb.fB(8), "Eredménye egyezik!");
    }
}