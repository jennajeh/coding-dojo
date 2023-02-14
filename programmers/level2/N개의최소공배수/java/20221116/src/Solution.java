class Solution {
    public int solution(int[] arr) {
        int answer = lcm(arr);

        return answer;
    }

    public int gcd(int a, int b) {
        int c = a % b;

        if (c == 0) {
            return b;
        }

        return gcd(b, c);
    }

    public int lcm(int[] arr) {
        int answer = 0;

        if (arr.length == 1) {
            return arr[0];
        }

        int b = gcd(arr[0], arr[1]);

        answer = (arr[0] * arr[1]) / b;

        if (arr.length > 2) {
            for (int i = 2; i < arr.length; i += 1) {
                b = gcd(answer, arr[i]);

                answer = (answer * arr[i]) / b;
            }
        }

        return answer;
    }
}
