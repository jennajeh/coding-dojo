## 문제

프로그래머스 [크레인 인형 뽑기](https://school.programmers.co.kr/learn/courses/30/lessons/64061?language=java)

#### 1. 이해

- board[][] 2차원 배열에 인형의 종류가 숫자로 주어진다. 0 ~ 100
- moves[] 1차원 배열에는 몇번째 행의 인형을 빼올건지 나타낸다.
- 배열 길이만큼 반복해서 비어있으면 새로운 배열에 넣고, 비어있지 않으면 새로운 배열에 넣을지 제거할지 결정

#### 2. 계획

- moves[] 배열에 있는 요소 중, board[][] 의 가장 위에 있는 인형을 제거한다.
- board[][] 배열의 행을 기준으로 판단해야 하기 때문에 moves[] 배열의 값을 기준으로 아래로 비교해야 한다.
- 값이 0일 경우 인형이 없는 것으로 판단한다.
- 스택이 비어있으면 스택에 쌓고, 스택이 비어있지 않으면 스택에 쌓을지 스택에서 제거할 지 판단.
- 현재 스택에 쌓인 인형과 동일한 인형일 경우 -> 스택에서 제거 후 제거 한 인형 개수 +2
- 현재 스택에 쌓인 인형과 다른 인형일 경우 -> 스택에 그대로 쌓기

#### 3. 실행
- 

#### 4. 반성

- 자꾸 오류가 나서 자세히 살펴보니까 0으로 초기화해주는 작업을 하지 않았다.
- 배열에서 제거를 하면 다시 그 위치를 갈 때 0으로 초기화해주지 않으면 새롭게 조건을 검사하기 때문에 꼭 초기화작업을 해야 한다.
- 이중 for 문 밖에 답이 없는건지 조언을 구해봐야 한다.
