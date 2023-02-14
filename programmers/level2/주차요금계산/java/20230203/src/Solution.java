import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
    public int[] solution(int[] fees, String[] records) {
//        startTime에 해당 차량 번호의 유무로 추차된 차량인지 정산하는 차량인지를 확인
//        - startTime에 없는 차량번호라면 주차하는 차량
//        - 차량 번호 저장 carSet
//                - 주차 시작 시간 기록
//                - 누적 시간 map에 존재하지 않는 차량이라면 <key, value>초기화
//        - startTime에 없는 차량  번호라면 나가는 차량
//                - 누적 시간에 (현재 시간 - startTime의 value)분 만큼 합
//                - 해당 키의 startTime clear
        int[] answer = {};
        int INF = 23 * 60 + 59;
        Map<Integer, Integer> startTime = new HashMap<>();
        Map<Integer, Integer> totalTime = new HashMap<>();
        Set<Integer> carSet = new HashSet<>();  // 차량 번호 저장

        for (String s : records) {
            // records 자르기
            String[] str = s.split(" ");
            // 시:분 자르기
            String[] times = str[0].split(":");
            int min = (Integer.parseInt(times[0]) * 60) + Integer.parseInt(times[1]);
            int num = Integer.parseInt(str[1]);
            if (!startTime.containsKey(num)) {
                carSet.add(num);
                startTime.put(num, min);
                if (!totalTime.containsKey(num)) {
                    totalTime.put(num, 0);
                }
            } else {
                totalTime.put(num, totalTime.get(num) + min - startTime.get(num));
                startTime.remove(num);
            }
        }

//        - startTime 맵에 아직 남아있는 요소는 출차된 내역이 없음
//                -> 출차된 내역이 없으면 23:59에 출차된 것으로 간주
//        - 현재까지의 누적 추자 시간에 INF - 주차 시작 시간을 합
//                -> INF = (23 x 60) + 59
        for (Integer key : startTime.keySet()) {
            totalTime.put(key, totalTime.get(key) + INF - startTime.get(key));
        }

//        carSet에 저장된 차량 내역을 List로 변환, 정렬
//        숫자가 작은 차량부터 요금을 계산
//                - 누적 시간이 기본 시간(fees[0])보다 작다면 기본요금(fees[1])만 계산
//                - 누적 시간이 기본 시간보다 크다면 기본요금(fees[1])에 초과시간(누적시간 - 기본시간(fees[0]))만큼 계산
//                    - 초과된 시간이 단위 시간으로 나눠지지 않으면 올림 처리
        List<Integer> list = new ArrayList<>(carSet);
        Collections.sort(list);
        answer = new int[carSet.size()];
        int idx = 0;
        for (int num : list) {
            int time = totalTime.get(num);
            if (time <= fees[0]) {
                answer[idx] = fees[1];
            } else {
                answer[idx] = (int) (fees[1] + Math.ceil((double) (time - fees[0]) / fees[2]) * fees[3]);
            }
            idx++;
        }

        return answer;
    }
}
