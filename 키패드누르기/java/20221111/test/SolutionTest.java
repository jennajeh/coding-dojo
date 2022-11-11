import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void solution() {
        Solution solution = new Solution();

        int[] numbers1 = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand1 = "right";

        assertEquals("LRLLLRLLRRL", solution.solution(numbers1, hand1));
//
//        int[] numbers2 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
//        String hand2 = "left";
//
//        assertEquals("LRLLRRLLLRR", solution.solution(numbers1, hand1));
//
//        int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
//        String hand3 = "right";
//
//        assertEquals("LLRLLRLLRL", solution.solution(numbers1, hand1));
    }

}
