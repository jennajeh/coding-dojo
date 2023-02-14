function solution(n, words) {
  let answer = [0, 0];

  for (let i = 0; i < words.length; i += 1) {
    const word = words[i];

    const person = i % n + 1;
    const turn = Math.ceil((i + 1) / n);

    if (i !== 0) {
      const last = words[i - 1].split("").pop();

      if (i > words.indexOf(word) || words[i][0] !== last) {
        answer = [person, turn];
        break;
      }
    } 
  }

  return answer;
}
