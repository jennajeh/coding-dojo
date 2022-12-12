import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = findMinAndMax(s);

        return answer;
    }

    public Integer min(String s) {
        return Arrays.stream(s.split(" "))
                .mapToInt(i -> Integer.valueOf(i))
                .min()
                .getAsInt();
    }

    public Integer max(String s) {
        return Arrays.stream(s.split(" "))
                .mapToInt(i -> Integer.valueOf(i))
                .max()
                .getAsInt();
    }

    public String findMinAndMax(String answer) {
        return min(answer) + " " + max(answer);
    }
}
