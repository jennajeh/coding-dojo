import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void replace() {
        Solution solution = new Solution();

        assertEquals("1478", solution.replace("one4seveneight"));
    }

    @Test
    void parse() {
        Solution solution = new Solution();

        assertEquals(1478, solution.parse("1478"));
    }

}
