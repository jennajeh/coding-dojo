import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void sum() {
        Solution solution = new Solution();

        assertEquals(6, solution.sum(123));
        assertEquals(24, solution.sum(987));
    }

}
