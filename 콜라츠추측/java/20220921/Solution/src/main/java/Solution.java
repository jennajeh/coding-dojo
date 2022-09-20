class Solution {
    public int solution(long num) {
        int answer = 0;

        if (num == 1) {
            return answer = 0;
        }

        answer = calculate(num);

        return answer;
    }

    public int calculate(long num) {
        int count = 0;

        while (num != 1) {
            if (isEven(num)) {
                num = num / 2;
                count += 1;

                continue;
            }

            if (!isEven(num)) {
                num = num * 3 + 1;
                count += 1;

                continue;
            }
        }

        if (count >= 500) {
            count = -1;
        }

        return count;
    }

    public Boolean isEven(long x) {
        return x % 2 == 0;
    }
}
