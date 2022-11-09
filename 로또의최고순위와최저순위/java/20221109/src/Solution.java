import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int win = countWin(lottos, win_nums);
        int zero = countZero(lottos);

        return getRanking(win, zero);
    }

    public int countZero(int[] lottos) {
        return Arrays.stream(lottos).filter(i -> i == 0).toArray().length;
    }

    public int countWin(int[] lottos, int[] win_nums) {
        List<Integer> winNums = Arrays.stream(win_nums)
                .boxed()
                .collect(Collectors.toList());

      return IntStream.range(0, lottos.length)
                .filter(i -> winNums.contains(lottos[i])).toArray().length;
    }

    public int[] getRanking(int win, int zero) {
        int[] answer = new int[2];

        answer[0] = win + zero > 1 ? 7 - (win + zero) : 6;
        answer[1] = win > 1 ? 7 - win : 6;

        return answer;
    }
}
