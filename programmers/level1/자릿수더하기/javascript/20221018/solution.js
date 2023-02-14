// eslint-disable-next-line import/prefer-default-export
export function split(n) {
  const number = n.toString().split('');

  return number;
}

export function sum(arr) {
  return arr.map((i) => parseInt(i, 10)).reduce((acc, x) => acc + x);
}

export function solution(n) {
  return sum(split(n));
}
