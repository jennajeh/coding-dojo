import solution from './solution';

test('solution 결과', () => {
  const id_list = ['muzi', 'frodo', 'apeach', 'neo'];
  const report = ['muzi frodo', 'apeach frodo', 'frodo neo', 'muzi neo', 'apeach muzi'];
  const k = 2;
  expect(solution(id_list, report, k)).toStrictEqual([2, 1, 1, 0]);
});
