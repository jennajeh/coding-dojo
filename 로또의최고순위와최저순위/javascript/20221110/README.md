## 문제

프로그래머스 [로또의 최고 순위와 최저 순위
](https://school.programmers.co.kr/learn/courses/30/lessons/77484?language=java)

#### 1. 이해

- lottos 배열에서 0의 개수를 센다.
- lottos 배열과 win_nums 배열을 비교해서 같은 값이 있는 지 카운트.

#### 2. 계획

- 맞춘 번호 최대값 = 맞춘 번호 + 0의 개수 (0이 모두 맞았다고 가정)
- 맞춘 번호 최소값 = 맞춘 번호 (0이 있을 때 모두 틀렸다고 가정)
- 맞춘 개수에 따라 최고 순위와 최저 순위 계산

#### 3. 실행

- ..

#### 4. 반성

- 등수 구할 때 key, value 객체 활용
- const getRanking = {
  6:1,
  5:2,
  4:3,
  3:4,
  2:5,
}
