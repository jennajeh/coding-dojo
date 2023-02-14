const pair = { '}': '{', ']': '[', ')': '(' }

function solution(s) {
  const arr = s.split(''); // 주어진 문자열을 배열로 만듦

  let result = 0

  const isValid = arr => {
    const stack = [];

    for (let i = 0; i < arr.length; i += 1) {
      const c = arr[i];

      if (pair[c] === undefined) {
        stack.push(c);
      }
      else {
        if (stack[stack.length - 1] !== pair[c]) {
          return false
        }

        stack.pop();  // 스택에 한 글자씩 넣되 짝이 맞는 괄호가 나오면 해당 괄호들을 꺼내서 제거
      }
    }

    if (stack.length) {
      return false
    }

    return true
  }

  for (let i = 0; i < s.length; i += 1) {
    if (isValid(arr)) {
      result++;  // 괄호 문자열이 올바르면 카운트 1 증가
    }

    arr.push(arr.shift());  // 문자열을 한칸씩 왼쪽으로 돌리면서 확인
  }

  return result;
}
