import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void findRemainderOne() {
        Solution solution = new Solution();

        assertEquals(3, solution.findRemainderOne(10));
    }
}
