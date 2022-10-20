export function solution(s) {
  return s.split(' ').map((i) => i.split('').map((i, index) => (index % 2 === 0 ? i.toUpperCase() : i.toLowerCase())).join('')).join(' ');
}
