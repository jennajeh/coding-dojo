import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> tempList = new ArrayList<>();
        int tempNumber = 10;

        for (int x : arr) {
            if (tempNumber != x) {
                tempList.add(x);
            }

            tempNumber = x;
        }

        int[] answer = new int[tempList.size()];

        for (int i = 0; i < answer.length; i += 1) {
            answer[i] = tempList.get(i).intValue();
        }

        return answer;
    }
}
