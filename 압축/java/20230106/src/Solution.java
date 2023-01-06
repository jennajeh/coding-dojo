import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public ArrayList<Integer> solution(String msg) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        HashMap<String, Integer> map = new HashMap<String,Integer>();

        int ind = 1;

        for (char i = 'A'; i <='Z'; i += 1) {
            map.put(i+"", ind ++);
        }

        int size = msg.length();

        for (int i = 0; i < size; i += 1) {
            int a = 1;

            while (i + a <= size && map.containsKey(msg.substring(i, i + a))) {
                a += 1;
            }

            if (i + a > size) {
                answer.add(map.get(msg.substring(i)));

                break;
            }

            answer.add(map.get(msg.substring(i, i + a - 1)));

            map.put(msg.substring(i, i + a), ind ++);

            if ( a > 1 ) {
                i += a - 2;
            }
        }

        return answer;
    }
}
