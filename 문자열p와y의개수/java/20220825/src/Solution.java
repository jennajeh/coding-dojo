class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count1 = 0;
        int count2 = 0;
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i += 1) {
            if (s.charAt(i) == 'p') {
                count1 += 1;
            }

            if(s.charAt(i) == 'y') {
                count2 += 1;
            }
        }

        if (count1 == count2) {
            answer = true;
        }

        if (count1 != count2) {
            answer = false;
        }

        return answer;
    }
}