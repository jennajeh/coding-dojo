import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void makeList() {
        Solution solution = new Solution();

        long n = 12345;

        assertEquals("[1, 2, 3, 4, 5]", solution.makeList(n).toString());
    }
}
