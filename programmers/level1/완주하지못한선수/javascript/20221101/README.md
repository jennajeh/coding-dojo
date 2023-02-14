## 문제

프로그래머스 [완주하지 못한 선수](https://school.programmers.co.kr/learn/courses/30/lessons/42576?language=javascript)

#### 1. 이해

- key, value 값을 지정해서 해시 이용해 풀기

#### 2. 계획

- reduce 를 사용해서 completion 의 value 를 key 값으로 만들어준다.
- 같은 이름이 있다면 value 에 1을 더하고, 그렇지 않으면 1을 할당한다. (completion 이름의 개수)
- 배열 participant 를 find 메서드를 사용해서 key 값을 체크한다.
- 배열에 이름이 존재하면 -1 을 해주고, 목록에 없다면 completion 이 아니기 때문에 true 를 리턴한다.

#### 3. 실행

- ..

#### 4. 반성

- sort 를 사용해서 정렬 후 배열의 각 값을 비교하려 했는데 배열의 길이가 긴 경우는 재배열 시키는 것 보다는 key 값을 통해 해결하는 해시 풀이가 더 낫다고 함.
