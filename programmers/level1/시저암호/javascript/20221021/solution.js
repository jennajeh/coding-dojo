export default function solution(s, n) {
  return s.split('').map((i) => {
    if (i == ' ') {
      return i;
    }

    const temp = i.charCodeAt();

    return i.toUpperCase().charCodeAt() + n > 90
      ? String.fromCharCode(temp + n - 26)
      : String.fromCharCode(temp + n);
  }).join('');
}
