import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int solution(String s) {
        int answer = parse(replace(s));

        return answer;
    }

    public String replace(String s) {
        String[] stringNumbers = {"zero", "one", "two",
                                "three", "four", "five",
                                "six", "seven", "eight", "nine"};

        for (int i = 0; i < stringNumbers.length; i++) {
            s = s.replace(stringNumbers[i], Integer.toString(i));
        }

        return s;
    }

    public int parse(String s) {
        return Integer.parseInt(s);
    }
}
