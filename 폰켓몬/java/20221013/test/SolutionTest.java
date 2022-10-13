import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void set() {
        Solution solution = new Solution();

        int[] test1 = {3, 1, 2, 3};
        int[] test2 = {3, 3, 3, 2, 2, 4};
        int[] test3 = {3, 3, 3, 2, 2, 2};

        assertEquals(2, solution.solution(test1));
        assertEquals(3, solution.solution(test2));
        assertEquals(2, solution.solution(test3));
    }
}
