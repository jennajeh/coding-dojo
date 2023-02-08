import java.util.HashMap;

// 종류별 옷의 개수를 구한 뒤 전부 곱해준다.
// 예를 들어 상의가 2개, 하의가 3개 있다면 상의를 0개/1개/2개 입는 경우와,
// 하의를 0개/1개/2개/3개 입는 경우의 수가 생기는데,
// 각각을 곱하면 3x4 = 12가지의 경우의 수를 얻을 수 있다.
// 다만, 하루에 최소 한 개의 의상은 입는다 라는 조건이 있기 때문에,
// 12에서 -1을 해주어 최종 결과값은 11이 된다.

//  상의의 수를 A 하의의 수를 B라고 하면 상의와 하의의 조합하는 경우의 수는 A * B
//  상의만 선택하고 하의는 선택하지 않을 수도 있고, 하의만 선택하고 상의를 선택하지 않을 수도 있다.
//    -> (A+1)*(B+1)
// 둘 중 하나는 아무것도 입지 않는 경우의 수도 있다.
//    -> (A+1)*(B+1) - 1

class Solution {
    public static int solution(String[][] clothes) {
        // <옷 종류, 총 개수>
        HashMap<String, Integer> hash = new HashMap<>();

        // type 별로 옷 종류가 몇개인지 세기
        for(String[] cloth : clothes){
            String type = cloth[1];
            hash.put(type, hash.getOrDefault(type, 1) + 1);
        }

        int answer = 1;

        for (String key : hash.keySet()) {
            answer *= hash.get(key);
        }

        return answer - 1;
    }
}
