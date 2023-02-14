class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLowerCase(c)) {
                answer.append(n + c <= 'z' ? (char) (n + c) : (char) (n + c - 26));
            }

            if (Character.isUpperCase(c)) {
                answer.append(n + c <= 'Z' ? (char) (n + c) : (char) (n + c - 26));
            }

            if (c == ' ') {
                answer.append(c);
            }
        }

        return answer.toString();
    }
}
