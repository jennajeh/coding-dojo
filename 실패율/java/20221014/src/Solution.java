import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(int N, int[] stages) {
        HashMap<Integer, Double> map = new HashMap<>();

        //각 스테이지에 머물러 있는 플레이어 수
        //스테이지 번호가 1~N까지이므로 0 인덱스는 버리기 위해 N+2
        int[] userFailCounts = new int[N+2];
        //각 스테이지에 도달한 플레이어 수
        int[] userTotalCounts = new int[N+1];

        //스테이지별 머물러 있는 플레이어 수 카운트
        for (int stage : stages) {
            userFailCounts[stage] ++;
        }

        //스테이지 별 도달한 플레이어 수 카운트
        userTotalCounts[N] = userFailCounts[N] + userFailCounts[N+1];
        for (int i = N-1; i >= 1; i--) {
            userTotalCounts[i] = userFailCounts[i] + userTotalCounts[i+1];
        }

        //스테이지 별 실패율 계산
        for (int i = 1; i < userTotalCounts.length; i += 1) {
            if (userFailCounts[i] == 0 || userTotalCounts[i] == 0) {
                map.put(i, 0.0);
                continue;
            }

            map.put(i, (double) userFailCounts[i] / userTotalCounts[i]);
        }

        //실패율(value) 값으로 스테이지 번호(key)를 내림차순으로 정렬
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (o1, o2) -> Double.compare(map.get(o2), map.get(o1)));

        return list.stream()
                //Integer 에서 int 로 변환
                .mapToInt(Integer::intValue).toArray();
    }
}
