import java.util.stream.IntStream;

public class Solution {
    public int solution(int n) {
        int answer = findRemainderOne(n);

        return answer;
    }

    public int findRemainderOne(int n) {
        return IntStream.rangeClosed(2, n)
                .filter(i -> n % i == 1)
                .findFirst()
                .getAsInt();
    }
}
