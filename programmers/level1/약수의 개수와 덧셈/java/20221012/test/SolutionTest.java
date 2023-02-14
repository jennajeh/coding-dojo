import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void countDivisior() {
        Solution solution = new Solution();

        assertEquals(2, solution.countDivisior(13));
        assertEquals(4, solution.countDivisior(14));
        assertEquals(5, solution.countDivisior(16));
        assertEquals(8, solution.countDivisior(24));
    }

    @Test
    void oddOrEven() {
        Solution solution = new Solution();

        assertEquals(43, solution.calculate(13, 17));
        assertEquals(52, solution.calculate(24, 27));
    }

}
