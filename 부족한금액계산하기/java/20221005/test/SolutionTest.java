import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void total() {
        Solution solution = new Solution();

        long price = 3;
        long count = 4;

        assertEquals(30, solution.total(price, count));
    }

    @Test
    void payment() {
        Solution solution = new Solution();

        long price = 3;
        long money = 20;
        long count = 4;

        assertEquals(10, solution.payment(price, money, count));

        money = 30;

        assertEquals(0, solution.payment(price, money, count));
    }
}
