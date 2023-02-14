import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void gcd() {
        Solution solution = new Solution();

        assertEquals(12, solution.gcd(60, 48));
    }

    @Test
    void lcm() {
        Solution solution = new Solution();

        int[] arr = {2, 6, 8, 14};

        assertEquals(168, solution.lcm(arr));
    }

}
