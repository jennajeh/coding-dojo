import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void solution() {
        Solution solution = new Solution();

        int[] answer = solution.solution("110010101001");

        assertEquals(answer[0], 3);
        assertEquals(answer[1], 8);

        int[] answer2 = solution.solution("01110");

        assertEquals(answer2[0], 3);
        assertEquals(answer2[1], 3);

        int[] answer3 = solution.solution("1111111");

        assertEquals(answer3[0], 4);
        assertEquals(answer3[1], 1);
    }
}
