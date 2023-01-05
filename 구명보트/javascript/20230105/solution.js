function test() {
  console.log('solution([70, 50, 80, 50], 100) : 3 --> ' + solution([70, 50, 80, 50], 100));
  console.log('solution([70, 80, 50], 100) : 3 --> ' + solution([70, 80, 50], 100));
  console.log('solution([70, 50, 30, 50], 100) : 2 --> ' + solution([70, 50, 30, 50], 100));
}

//test();

function solution(people, limit) {
  let answer = 0;

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
