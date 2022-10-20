import { solution } from './solution';

test('단어 자르기', () => {
  expect(solution('try hello world')).toEqual('TrY HeLlO WoRlD');
});
