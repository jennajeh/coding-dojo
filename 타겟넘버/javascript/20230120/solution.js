function solution(numbers, target) {
    let answer = 0  //타겟 넘버를 만드는 방법의 수
    
    function dfs(idx, sum) {  //numbers의 인덱스와 현재까지의 합계
        if(idx==numbers.length) {  //numbers의 인덱스를 모두 탐색했다면
            if(sum==target) answer++;  //현재까지의 합계가 타겟 넘버이면 answer++
            
            return;
        }
        
        //아직 numbers를 끝까지 탐색하지 않았다면
        //해당 숫자를 더하거나 빼는 두 방법으로 나아간다
        dfs(idx+1, sum+numbers[idx]);  //해당 숫자를 더한다
        dfs(idx+1, sum-numbers[idx]);  //해당 숫자를 뺀다
    }
    
    dfs(0,0)  //함수 호출 (0번째 숫자, 현재까지 합계 0)
    
    return answer;
}
