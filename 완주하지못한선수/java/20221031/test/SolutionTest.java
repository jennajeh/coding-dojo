import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void addPlayer() {
        Solution solution = new Solution();

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        assertEquals("{leo=1, eden=0, kiki=0}", solution.addPlayer(participant, completion).toString());
    }

    @Test
    void unfinishedRunner() {
        Solution solution = new Solution();

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        HashMap<String, Integer> runner = solution.addPlayer(participant, completion);

        assertEquals("leo", solution.unfinishedRunner(runner));
    }
}
