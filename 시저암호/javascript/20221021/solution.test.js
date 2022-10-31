import solution from './solution';

test('solution', () => {
  expect(solution('AB', 1)).toEqual('BC');
});

test('solution', () => {
  expect(solution('z', 1)).toEqual('a');
});

test('solution', () => {
  expect(solution('a B z', 4)).toEqual('e F d');
});
