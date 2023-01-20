class Solution {
    int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);

        return answer;
    }
    public void dfs(int[] numbers, int target, int depth, int sum){
        if (depth == numbers.length){ //마지막 노드까지 진행했을 때
            if (target == sum){ //target 값과 합계가 같다면
                answer++;
            }

            return;
        }

        int plus = sum + numbers[depth]; //양수를 더한 값
        int minus = sum - numbers[depth]; //음수를 더한 값

        dfs(numbers, target, depth+1, plus);
        dfs(numbers, target, depth+1, minus);
    }
}
