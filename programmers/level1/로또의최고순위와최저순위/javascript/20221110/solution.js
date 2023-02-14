export default function solution(lottos, win_nums) {
  const wins = lottos.filter((lotto) => win_nums.includes(lotto)).length;
  const zeros = lottos.filter((lotto) => lotto === 0).length;

  const max = wins > 1 ? 7 - wins : 6;
  const min = wins + zeros > 1 ? 7 - (wins + zeros) : 6;

  const answer = [min, max];

  return answer;
}
