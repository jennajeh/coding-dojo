class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        int left = 10;
        int right = 12;

        for (int i = 0; i < numbers.length; i += 1) {
            int n = numbers[i];

            if (n == 1 || n == 4 || n == 7) {
                left = n;
                answer.append("L");
            }

            if (n == 3 || n == 6 || n == 9) {
                right = n;
                answer.append("R");
            }

            if (n == 2 || n == 5 || n == 8 || n == 0) {
                if (n == 0) {
                    n = 11;
                }

                int leftDistance = (Math.abs(n - left) / 3) + (Math.abs(n - left) % 3);
                int rightDistance = (Math.abs(n - right) / 3) + (Math.abs(n - right) % 3);

                if (leftDistance == rightDistance) {
                    if (hand.equals("right")) {
                        right = n;
                        answer.append("R");
                    }

                    if (hand.equals("left")) {
                        left = n;
                        answer.append("L");
                    }
                }

                if (leftDistance > rightDistance) {
                    right = n;
                    answer.append("R");
                }

                if (leftDistance < rightDistance) {
                    left = n;
                    answer.append("L");
                }
            }
        }

        return answer.toString();
    }
}
