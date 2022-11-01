import solution from './solution';

test('완주하지 못한 선수', () => {
  const a = ["leo", "kiki", "eden"];
  const b = ["eden", "kiki"];

  expect(solution(a, b)).toStrictEqual('leo');
});

test('완주하지 못한 선수', () => {
  const a = ["marina", "josipa", "nikola", "vinko", "filipa"]	;
  const b = ["josipa", "filipa", "marina", "nikola"];

  expect(solution(a, b)).toStrictEqual('vinko');
});

test('완주하지 못한 선수', () => {
  const a = ["mislav", "stanko", "mislav", "ana"];
  const b = ["stanko", "ana", "mislav"];

  expect(solution(a, b)).toStrictEqual('mislav');
});
