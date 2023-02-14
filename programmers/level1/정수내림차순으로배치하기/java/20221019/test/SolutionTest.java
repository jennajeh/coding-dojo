import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void sort() {
        Solution solution = new Solution();

        assertEquals(solution.sort(118372), 873211);
    }
}
