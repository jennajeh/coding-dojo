import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void isEven() {
        Solution solution = new Solution();

        assertTrue(solution.isEven(2));
        assertFalse(solution.isEven(5));
    }

    @Test
    void calculateUntilOne() {
        Solution solution = new Solution();

        assertEquals(8, solution.calculate(6));
    }
}
