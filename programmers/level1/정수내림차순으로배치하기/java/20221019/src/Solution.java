import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public long solution(long n) {
        long answer = sort(n);

        return answer;
    }

    public long sort(long i) {
        return Long.parseLong(Arrays.stream(String.valueOf(i).split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));
    }
}
