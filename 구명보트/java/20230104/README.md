## 문제

프로그래머스 [구명보트](https://school.programmers.co.kr/learn/courses/30/lessons/42885?language=java)

#### 1. 이해

- 최소한의 횟수로 구명보트로 옮기기 위해서는 가장 몸무게가 큰 사람 + 적은 사람 조합이여야 한다.

#### 2. 계획

- people 을 정렬한다.
- 최솟값 min 은 0, 최댓값 max 는 people 길이 - 1 로 초기화해준다.
- min <= max 를 반복하면서, people[min] + people[max] 가 limit 보다 작거나 같으면 min += 1 을 해준다.
    - 구명보트를 같이 탄 걸로 처리
- 위 if 문에서 걸리지 않으면 max 혼자 구명보트를 탄 걸로 처리하고 보트 개수인 answer += 1 을 해준다.

#### 3. 실행

- ..

#### 4. 반성

- ..
