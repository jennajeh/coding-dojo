import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    @Test
    void divisor() {
        Solution solution = new Solution();

        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        assertTrue(solution.canDivide(arr, divisor));
    }
}
