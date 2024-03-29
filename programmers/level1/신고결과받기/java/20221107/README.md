## 문제

프로그래머스 [신고 결과 받기](https://school.programmers.co.kr/learn/courses/30/lessons/92334?language=java)

#### 1. 이해

- 한 사람이 동일한 사람을 신고해도 카운트는 1로 취급되기 때문에 report 배열에서 중복 제거하기
- id_list 배열에서 신고 한 사람과 신고 당한 사람 분리
- 신고 당한 사람과 신고 한 사람을 key, value 로 묶음

#### 2. 계획

- key는 유저아이디, value는 key를 신고한 유저의 아이디의 Set을 가진 Map 생성 [신고한 id, 신고된 id]
    - 동일한 유저에 대한 신고횟수는 1회로 처리하기 때문에 중복을 없애기 위해 Set을 Value로 함
- key는 유저아이디, value는 임의의 인덱스를 가진 또 다른 Map을 생성 [신고된 id, 받은 메일 수]
- "신고자 Id 신고한 Id"로 입력이 주어지기 때문에 split()함수를 이용해 from과 to를 구분
- 신고한 Id에 대해 누가 신고했는지 Map에 저장
- 이용이 정지된 유저에 대해 해당 유저를 신고한 Id에 메일이 몇번 전송되는지 파악
    - map에는 해당 유저를 신고한 Id Set이 저장되어 있음
- map을 순회하여 Set마다 사이즈가 2이상인지 확인
- 2이상이라면 Set(해당 유저를 신고한 ID)에게 메일을 발송
- 신고한 Id에 대해 누적값을 1씩 증가

#### 3. 실행
- 

#### 4. 반성
- 
