import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    SimpleCalculator sc = new SimpleCalculator();

    @Test
    void testGradeA() {
        assertEquals('A', sc.determineLetterGrade(95), "Expected grade: A");
    }

    @Test
    void testGradeB() {
        assertEquals('B', sc.determineLetterGrade(85), "Expected grade: B");
    }

    @Test
    void testGradeC() {
        assertEquals('C', sc.determineLetterGrade(75), "Expected grade: C");
    }

    @Test
    void testGradeD() {
        assertEquals('D', sc.determineLetterGrade(65), "Expected grade: D");
    }

    @Test
    void testGradeF() {
        assertEquals('F', sc.determineLetterGrade(45), "Expected grade: F");
    }

    @Test
    void testInvalidScoreLow() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> sc.add(-1));
        assertEquals("Score must be between 0 and 100", exception.getMessage());
    }

    @Test
    void testInvalidScoreHigh() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> sc.add(101));
        assertEquals("Score must be between 0 and 100", exception.getMessage());
    }
}