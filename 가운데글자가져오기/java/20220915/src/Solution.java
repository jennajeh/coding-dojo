class Solution {
    public String solution(String s) {
        String answer = s;
        int stringLength = s.length();

        if (stringLength % 2 == 0) {
            answer = s.substring((stringLength/2 - 1), (stringLength/2 + 1));
        }

        if (stringLength % 2 != 0) {
            answer = s.substring((stringLength/2), (stringLength/2 + 1));
        }

        return answer;
    }
}
