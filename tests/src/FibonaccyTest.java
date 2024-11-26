import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonaccyTest {
    Fibonaccy fMany = new Fibonaccy();

    @Test
    public void nIsZero() {
        assertEquals(0, fMany.Fibonacci(0), "It should be zero!");
    }

    @Test
    public void nIsOne() {
        assertEquals(1, fMany.Fibonacci(1), "It should be one!");
    }

    @Test
    public void nIsNegative(){
        assertEquals(0, fMany.Fibonacci(-5), "It should be 0");
    }
}