import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void split() {
        Solution solution = new Solution();
        String s = "1 2 3 4";

        String[] arr = solution.split(s);

        assertEquals("1", arr[0]);
        assertEquals("2", arr[1]);
        assertEquals("3", arr[2]);
    }

    @Test
    void findMaxAndMin() {
        Solution solution = new Solution();
        String[] arr = {"4", "3", "2", "1"};

        String answer = solution.findMaxAndMin(arr);

        assertEquals("1 4", answer);
    }
}
