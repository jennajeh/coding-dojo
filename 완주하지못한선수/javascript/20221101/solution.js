export default function solution(participant, completion) {
  const unfinishedRunner = completion.reduce(
    (arr, key) => (arr[key] = arr[key] ? arr[key] + 1 : 1, arr), {});

  return participant.find((key) => {
    if (!unfinishedRunner[key]) {
      return true;
  }
    unfinishedRunner[key] -= 1;
  });
}
