export function split(n) {
  return n.toString().split('');
}

export function sort(array) {
  return array.sort((a, b) => b - a);
}

export function join(array) {
  return parseInt(array.join(''), 10);
}

export function solution(n) {
  const numbers = sort(split(n));

  return join(numbers);
}
