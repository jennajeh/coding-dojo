import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void answer() {
        Solution solution = new Solution();

        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        int[][] array = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        assertEquals(4, solution.solution(array, moves));
    }

}
