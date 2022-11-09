class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int win = countWin(lottos, win_nums);
        int zero = countZero(lottos);

        answer[0] = win + zero > 1 ? 7 - (win + zero) : 6;
        answer[1] = win > 1 ? 7 - win : 6;

        return answer;
    }

    public int countZero(int[] lottos) {
        int zero = 0;

        for (int i : lottos) {
            if (i == 0) {
                zero += 1;
            }
        }

        return zero;
    }

    public int countWin(int[] lottos, int[] win_nums) {
        int win = 0;

        for (int i = 0; i < win_nums.length; i += 1) {
            for (int j = 0; j < win_nums.length; j += 1) {
                if (lottos[i] == win_nums[j]) {
                    win += 1;
                }
            }
        }

        return win;
    }
}
