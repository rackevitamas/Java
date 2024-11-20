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
        assertEquals('F', sc.determineLetterGrade(55), "Expected grade: F");
    }
}