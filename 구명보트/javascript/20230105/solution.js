function solution(people, limit) {
  const answer = 0;

  people.sort((a, b) => a - b);

  while (people.length > 0) {
    if (limit - people[people.length - 1] >= people[0]) {
      people.shift();
    }

    people.pop();

    answer += 1;
  }

  return answer;
}
