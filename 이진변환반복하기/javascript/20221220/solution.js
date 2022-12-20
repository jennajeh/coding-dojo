function test() {
  console.log('solution("110010101001") : 3,8 -> '
             + solution("110010101001"));
  console.log('solution("01110") : 3,3 -> '
         + solution("01110"));
  console.log('solution("1111111") : 4,1 -> '
         + solution("1111111"));
}

test();

function solution(s) {
const answer = [0, 0];

while (s !== '1') {
  let initialLength = s.length;

  s = s.toString(2).match(/1/g).length;

  answer[0] += 1;

  answer[1] += initialLength - s;

  s = s.toString(2);
}

return answer;
}
