class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[] {-1};
        }

        //배열의 길이가 1이 아닐 때, 가장 작은 수 하나 뺀 크기로 배열 초기화
        int[] answer = new int[arr.length - 1];

        //임의로 하나의 값을 제일 작은 수로 가정함
        int min = arr[0];

        for (int i = 0; i < arr.length; i += 1) {
            //두 인자값 중 더 작은 값을 min 에 저장
            min = Math.min(min, arr[i]);
        }

        //반복문 증감 인덱스용 변수 초기화
        int x = 0;

        //가장 작은 수 제외한 배열 만들기
        for (int i = 0; i < arr.length; i += 1) {
            //arr 배열의 값이 가장 작은 수인 min 값과 같다면 continue
            if (arr[i] == min) {
                continue;
            }

            //arr 배열의 값이 가장 작은 수인 min 과 같지 않다면 arr 배열에 순서대로 넣어준다.
            answer[x++] = arr[i];
        }

        return answer;
    }
}
