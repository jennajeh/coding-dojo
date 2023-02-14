class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        for (int i = 0; i < numbers.length; i += 1) {
            answer += numbers[i];
        }

        return 45 - answer;
    }
}
