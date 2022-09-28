import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void reverseTest() {
        String s = "Zbcdefg";

        char[] charArray = s.toCharArray();

        Arrays.sort(charArray);

        String arr = new StringBuilder(new String(charArray)).reverse().toString();

        assertEquals("gfedcbZ", arr);
    }

    @Test
    void reverseOrder() {
        Solution solution = new Solution();

        String s = solution.reverseOrder("Zbcdefg");

        assertEquals("gfedcbZ", s);
    }
}
