import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeglalapTest {
    Teglalap tg = new Teglalap();

    @Test
    void testTerulet(){
        assertEquals(0, tg.addT(0, 5));
    }

    @Test
    void testKerulet(){
        assertEquals(0, tg.addK(0, 3));
    }
}