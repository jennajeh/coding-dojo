import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void countZero() {
        Solution solution = new Solution();

        int[] lottos = {44, 1, 0, 0, 31, 25};

        assertEquals(2, solution.countZero(lottos));
    }

    @Test
    void countWin() {
        Solution solution = new Solution();

        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        assertEquals(2, solution.countWin(lottos, win_nums));
    }

    @Test
    void solution() {
        Solution solution = new Solution();

        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        assertEquals(3, solution.solution(lottos, win_nums)[0]);
        assertEquals(5, solution.solution(lottos, win_nums)[1]);
    }
}
