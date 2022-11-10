import solution from './solution';

test('solution', () => {
  const lottos = [44, 1, 0, 0, 31, 25];
  const win = [31, 10, 45, 1, 6, 19];
  expect(solution(lottos, win)).toStrictEqual([3, 5]);
});
