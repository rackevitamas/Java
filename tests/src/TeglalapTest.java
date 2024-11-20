import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TeglalapTest {
    Teglalap tg = new Teglalap();

    @Test
    void testTerulet() {
        assertEquals(35, tg.terulet(5, 7));
    }

    @Test
    void testKerulet() {
        assertEquals(24, tg.kerulet(5, 7));
    }

    @Test
    void testTeruletHibasBemenet() {
        assertThrows(IllegalArgumentException.class, () -> tg.terulet(0, 5));
        assertThrows(IllegalArgumentException.class, () -> tg.terulet(-1, 7));
    }

    @Test
    void testKeruletHibasBemenet() {
        assertThrows(IllegalArgumentException.class, () -> tg.kerulet(0, 5));
        assertThrows(IllegalArgumentException.class, () -> tg.kerulet(5, -3));
    }
}
