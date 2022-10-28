import replace from './solution';

test('문자열 숫자로 치환하기', () => {
  expect(replace('one4seveneight')).toEqual(1478);
});
