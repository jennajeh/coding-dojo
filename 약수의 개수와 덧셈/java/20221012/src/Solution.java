import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int solution(int left, int right) {
        int answer = calculate(left, right);

        return answer;
    }

    public int calculate(int left, int right) {
        return IntStream.rangeClosed(left, right)
                .map(number -> countDivisior(number) % 2 == 0
                        ? number : -number)
                .reduce(0, (value, number) -> value + number);
    }

    public int countDivisior(int number) {
        return (int) IntStream.rangeClosed(1, number)
                .filter(i -> number % i == 0)
                .count();
    }
}
