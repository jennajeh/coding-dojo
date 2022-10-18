import { solution, split, sum } from './solution';

test('solution', () => {
  expect(solution(123)).toBe(6);
});

test('split', () => {
  expect(split(123)).toEqual(['1', '2', '3']);
});

test('sum', () => {
  expect(sum(['1', '2', '3'])).toBe(6);
});
