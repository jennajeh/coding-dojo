## 문제

프로그래머스 [신고 결과 받기](https://school.programmers.co.kr/learn/courses/30/lessons/92334?language=javascript)

#### 1. 이해

- 한 사람이 동일한 사람을 신고해도 카운트는 1로 취급되기 때문에 report 배열에서 중복 제거하기
- id_list 배열에서 신고 한 사람과 신고 당한 사람 분리
- 신고 당한 사람과 신고 한 사람을 key, value 로 묶음

#### 2. 계획

- key 로 id_list 의 id 를, value 로 빈 배열을 가지는 객체 생성.
- report 를 map 연산으로 신고자, 피신고자를 split 함.
  - 각 아이디가 배열에 포함되는 지 여부를 확인하여 포함하지 않을 때만 배열에 신고자 이름 추가.
- 반복문 돌면서 k번째 횟수와 피신고자의 배열 key 길이 비교.
  - k 이상이면 정지당한 유저임.
  - 그 횟수만큼 answer 에 넣어주기 (메일의 수)

#### 3. 실행

- ..

#### 4. 반성

- eslint 가 for문 쓰지 말라고 경고 주는 것 같다. 리팩토링 필요..
