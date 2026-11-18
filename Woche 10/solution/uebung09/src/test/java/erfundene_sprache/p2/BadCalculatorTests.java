package erfundene_sprache.p2;

import org.junit.Test;
import static org.junit.Assert.*;

public class BadCalculatorTests {

    @Test
    public void testBadCalculatorImplementsCalculator() {
        Calculator c1 = new BadCalculator(2);
        Calculator c2 = new BadCalculator(16);

        assertEquals(2, c1.add(1, 1));
        assertEquals(16, c2.multiply(2, 8));
        assertEquals(2, c1.multiply(2, 8));
    }
}
