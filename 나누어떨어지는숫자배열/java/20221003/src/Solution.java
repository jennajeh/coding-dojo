import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> number = new ArrayList<>();

        for (int i = 0; i < arr.length; i += 1) {
            if (arr[i] % divisor == 0) {
                number.add(arr[i]);
            }
        }

        if (number.isEmpty()) {
            number.add(-1);
        }

        int[] answer = new int[number.size()];

        for (int i = 0; i < number.size(); i += 1) {
            answer[i] = number.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}
