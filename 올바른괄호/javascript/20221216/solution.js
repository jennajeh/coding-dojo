function solution(s) {
  const stack = [];

  for (c of s) {
    if (c === '(') {
      stack.push(c);

      continue;
    }

    if (stack.length === 0) {
      return false;
    }

    stack.pop();
  }

  if (stack.length !== 0) {
    answer = false;
  }

  return stack.length ? false : true;
}
