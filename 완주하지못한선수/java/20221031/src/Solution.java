import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i = 0;

        for(i = 0 ; i < completion.length; i += 1) {
            if (!participant[i].equals(completion[i])) {
                break;
            }
        }

        return participant[i];
    }
}
