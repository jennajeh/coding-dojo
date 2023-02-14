class Solution {
    public int solution(int num) {
        long n = num;

        int answer = 0;

        if (n == 1) {
            return answer = 0;
        }

        answer = calculate(n);

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

    public Boolean isEven(long num) {
        return num % 2 == 0;
    }
}
