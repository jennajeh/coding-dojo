class Solution {
    public int solution(int n) {
        int count = 0;
        int answer = 0;

        for(int i = 1 ; i <= n ; i += 1) {
            for(int j = 1 ; j <= i ; j += 1) {
                if ( i % j == 0) {
                    count += 1;
                }
            }
            if(count == 2) {
                answer += 1;
            }
            count = 0;
        }

        return answer;
    }
}
