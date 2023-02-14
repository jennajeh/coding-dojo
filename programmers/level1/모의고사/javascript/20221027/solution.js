export default function solution(answers) {
  const first = [1, 2, 3, 4, 5];
  const second = [2, 1, 2, 3, 2, 4, 2, 5];
  const third = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
  const answer = [];

  const firstAnswer = answers.filter((a, i) => a === first[i % 5]).length;
  const secondAnswer = answers.filter((a, i) => a === second[i % 8]).length;
  const thirdAnswer = answers.filter((a, i) => a === third[i % 10]).length;
  const max = Math.max(firstAnswer, secondAnswer, thirdAnswer);

  if (firstAnswer === max) { answer.push(1); }
  if (secondAnswer === max) { answer.push(2); }
  if (thirdAnswer === max) { answer.push(3); }

  return answer;
}
