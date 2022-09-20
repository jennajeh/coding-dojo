import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void split() {
        Solution solution = new Solution();

        int x = 12;

        String number = new StringBuilder().append("").append(x).toString();

        String[] numbers = number.split("");

        assertEquals("1", numbers[0]);
        assertEquals("2", numbers[1]);
    }

    @Test
    void splitNumber() {
        Solution solution = new Solution();

        assertEquals(3, solution.splitNumber(12));
    }

    @Test
    void isHarshadNumber() {
        Solution solution = new Solution();

        int sum1 = solution.splitNumber(10);
        int sum2 = solution.splitNumber(11);
        int sum3 = solution.splitNumber(12);
        int sum4 = solution.splitNumber(13);

        assertTrue(solution.isHarshadNumber(10, sum1));
        assertFalse(solution.isHarshadNumber(11, sum2));
        assertTrue(solution.isHarshadNumber(12, sum3));
        assertFalse(solution.isHarshadNumber(13, sum4));
    }

}
