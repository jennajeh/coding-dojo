import {
  split, sort, join, solution,
} from './solution';

test('split', () => {
  expect(split(118372)).toEqual(['1', '1', '8', '3', '7', '2']);
});

test('sort', () => {
  expect(sort(split(118372))).toEqual(['8', '7', '3', '2', '1', '1']);
});

test('join', () => {
  expect(join(['1', '1', '8', '3', '7', '2'])).toBe(118372);
});

test('solution', () => {
  expect(solution(118372)).toBe(873211);
});
