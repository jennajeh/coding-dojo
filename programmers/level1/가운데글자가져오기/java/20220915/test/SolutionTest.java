import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void evenNumberSolution() {
        Solution solution = new Solution();

        assertEquals("de", solution.solution("abderr"));
        assertEquals("we", solution.solution("qwer"));
    }

    @Test
    void oddNumberSolution() {
        Solution solution = new Solution();

        assertEquals("c", solution.solution("abcde"));
        assertEquals("e", solution.solution("abcdefghi"));
    }
}
