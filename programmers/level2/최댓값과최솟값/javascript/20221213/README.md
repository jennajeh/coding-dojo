### 문제

프로그래머스 [최댓값과 최솟값](https://school.programmers.co.kr/learn/courses/30/lessons/12939?language=javascript)

#### 1. 이해
- 공백을 기준으로 split 해서 나온 배열에서 최대값과 최소값 구하기

#### 2. 계획
- 공백을 기준으로 split 해서 배열 생성
- split 한 배열을 Math.max, Math.min 으로 최대값 최솟값 구하기

#### 3. 실행
- ...

#### 4. 반성
- Math.min을 쓰려면 배열을 그냥쓰면 안되고 spread연산자를 이용해야 한다.
- Math.min과 Math.max는 문자열 array 도 취급한다.
- Math.min(...s.split(' '))과 Math.max(...s.split(' ')) 모두 이용할 수 있다.
