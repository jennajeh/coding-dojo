class Solution {
    public double solution(int[] arr) {
        double answer = 0;

        for (double numbers : arr) {
            answer += numbers;
        }

        answer /= arr.length;

        return answer;
    }
}
