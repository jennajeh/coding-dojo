import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = unfinishedRunner(addPlayer(participant, completion));
        return answer;
    }

    public String unfinishedRunner(HashMap<String, Integer> runner) {
        String answer = "";

        for (String key : runner.keySet()) {
            if (runner.get(key) != 0) {
                answer = key;
                break;
            }
        }

        return answer;
    }

    public HashMap<String, Integer> addPlayer(String[] participant, String[] completion) {
        HashMap<String, Integer> runner = new HashMap<>();

        for (String player : participant) {
            runner.put(player, runner.getOrDefault(player, 0) + 1);
        }

        for (String player : completion) {
            runner.put(player, runner.get(player) - 1);
        }

        return runner;
    }
}
