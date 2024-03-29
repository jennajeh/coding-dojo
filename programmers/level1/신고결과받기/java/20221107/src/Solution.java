import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, HashSet<String>> reporters = new HashMap<>();
        Map<String, Integer> index = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            String name = id_list[i];
            reporters.put(name, new HashSet<>());
            index.put(name, i);
        }

        for (String s : report) {
            String[] str = s.split(" ");
            String from = str[0];
            String to = str[1];
            reporters.get(to).add(from);
        }

        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> send = reporters.get(id_list[i]);
            if (send.size() >= k) {
                for (String name : send) {
                    answer[index.get(name)]++;
                }
            }
        }
        return answer;
    }
}
