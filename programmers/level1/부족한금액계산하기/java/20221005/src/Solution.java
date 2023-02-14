import java.util.stream.IntStream;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = payment(price, money, count);

        return answer;
    }

    public long payment(long price, long money, long count) {
        if (money > total(price, count)) {
            return 0;
        }

        return total(price, count) - money;
    }

    public long total(long price, long count) {
        return IntStream.rangeClosed(1, Math.toIntExact(count))
                .sum() * price;
    }
}
