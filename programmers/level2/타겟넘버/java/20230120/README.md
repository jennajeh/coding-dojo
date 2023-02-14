## 문제

프로그래머스 [타겟넘버](https://school.programmers.co.kr/learn/courses/30/lessons/43165?language=java)

#### 1. 이해

- 깊이 우선 탐색 알고리즘을 이용
- 마지막 노드까지 탐색했을 때 타겟 넘버와 결과값이 같으면 정답 카운트 증가

#### 2. 계획

- count : 전역 변수
- dfs(int [] numbers, int depth, int target, int result) : 깊이 우선 탐색을 위한 재귀 함수
- depth : 이진트리 깊이
- result : 이전 노드까지의 합계

1. dfs(numbers, 0, target, 0);을 실행한다.
    - 초기 depth와 reuslt는 0으로 초기화한다.

2. 깊이 우선 탐색 함수 선언
    - 마지막 노드까지 탐색했을 경우, target값과 result값이 같다면 count 변수 1 증가
    - 깊이를 1 증가시키고 양수를 더한 값과 음수를 더한 값 각각 dfs()를 이용해 다시 탐색

#### 3. 실행

- ..

#### 4. 반성

- ..
