import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Solution {
    public int solution(String s) {
        int answer = parse(replace(s));

        return answer;
    }

    public String replace(String s) {
        Map<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");

        return map.keySet().stream()
                .reduce(s, (acc, key) -> acc.replace(key, map.get(key)));
    }

    public int parse(String s) {
        return Integer.parseInt(s);
    }
}
