class Solution {
    public int solution(int n) {
        int answer = findAllWays(n);

        test();

        return answer;

    }

    public void test() {
        System.out.println("findAllWays(15) : 4 => " + findAllWays(15));
    }

    public int findAllWays(int number) {
        int answer = 1;

        for(int i = 1; i <= number / 2; i += 1) {
            int sum = i;

            for(int j = i + 1; sum < number; j += 1) {
                sum += j;
            }

            if(sum == number) {
                answer += 1;
            }
        }

        return answer;
    }
}
