import solution from './solution';

test('도난당한 학생과 여벌 체육복이 있는 학생 구하기', () => {
  expect(solution(5, [2, 4], [1, 3, 5])).toStrictEqual(5);
  expect(solution(5, [2, 3], [3])).toStrictEqual(4);
  expect(solution(5, [2, 4], [3])).toStrictEqual(4);
  expect(solution(3, [3], [1])).toStrictEqual(2);
});
