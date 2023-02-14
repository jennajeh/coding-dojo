import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = reverseOrder(s);

        return answer;
    }

    public String reverseOrder(String s) {
        char[] x = s.toCharArray();

        Arrays.sort(x);

        return new StringBuilder(new String(x)).reverse().toString();
    }
}
