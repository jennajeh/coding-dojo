### 문제

프로그래머스 [이진 변환 반복하기](https://school.programmers.co.kr/learn/courses/30/lessons/70129?language=java)

#### 1. 이해

- 0이 1이 될 때까지 계속 1씩 더해줌

#### 2. 계획

- while 문으로 s 의 길이가 1이 될 때까지 반복문을 돌림.
- 첫 번째 문자가 0 이면 answer[1] += 1;
- 0이 아니면 1의 횟수를 세어주는 countOne 을 1씩 더해줌. (이진수라서 0이 아니면 무조건 1)
- countOne 을 toBinaryString() 사용해서 이진수로 변경하고 s 에 대입
- 이렇게 이진수로 변환할 때마다 answer[0] += 1 을 해줌
- s 가 1 이 될 때까지 반복하면 이진 변환 횟수와 제거한 0의 개수가 나옴.

#### 3. 실행

- ..

#### 4. 반성

- ..
