import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void split() {
        Solution solution = new Solution();

        String s = "try hello world";

        assertEquals("t", solution.splitWord(s)[0]);
        assertEquals("r", solution.splitWord(s)[1]);
        assertEquals("y", solution.splitWord(s)[2]);
    }

    @Test
    void changeToUpperCase() {
        Solution solution = new Solution();

        String s = "try hello world";
        String[] words = solution.splitWord(s);

        assertEquals("TrY HeLlO WoRlD", solution.toUpperCase(words));
    }

}
