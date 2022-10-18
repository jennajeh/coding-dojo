import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {
    public int solution(int n) {
        int answer = sum(n);

        return answer;
    }

    public int sum(int i) {
        return Stream.of(Integer.toString(i).split(""))
                .mapToInt(number -> Integer.parseInt(number))
                .sum();
    }
}
