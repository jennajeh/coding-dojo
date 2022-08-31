class Solution {
    public String solution(String phone_number) {
        char[] answer = phone_number.toCharArray();

        for (int i = 0; i < answer.length - 4; i += 1) {
            answer[i] = '*';
        }

        return String.valueOf(answer);
    }
}
