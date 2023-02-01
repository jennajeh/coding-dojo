import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int[] solution(String s) {

        ArrayList<Integer> list = new ArrayList<>();

        s = s.substring(2, s.length());
        s = s.substring(0, s.length() - 2).replace("},{", "-");

        String str[] = s.split("-");

        Arrays.sort(str, (a, b) -> a.length() > b.length() ? 1 : -1);

        for (String x : str) {
            String[] temp = x.split(",");

            for (int i = 0; i < temp.length; i += 1) {
                int n = Integer.parseInt(temp[i]);

                if (!list.contains(n)) {
                    list.add(n);
                }
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i += 1) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
