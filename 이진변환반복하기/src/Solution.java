class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while(s.length() > 1) {
            int cntOne = 0;

            for(int i = 0; i < s.length(); i += 1) {

                if (s.charAt(i) == '0') {
                    answer[1] += 1;

                    continue;
                }

                cntOne += 1;
            }

            s = Integer.toBinaryString(cntOne);

            answer[0] += 1;
        }

        return answer;
    }
}
