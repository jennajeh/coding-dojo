function test() {
  console.log('solution("FRANCE", "french") : 16384 --> ' + solution("FRANCE", "french"));
  console.log('solution("handshake", "shake hands") : 65536 --> ' + solution("handshake", "shake hands"));
  console.log('solution("aa1+aa2", "AAAA12") : 43690 --> ' + solution("aa1+aa2", "AAAA12"));
  console.log('solution("E=M*C^2", "e=m*c^2") : 65536 --> ' + solution("E=M*C^2", "e=m*c^2"));
}
test();

function solution(str1, str2) {
  let answer = 0;
  
  const upperStr1 = str1.toUpperCase();
  const upperStr2 = str2.toUpperCase();
  
  const arrStr1 = splitEl(upperStr1);
  const arrStr2 = splitEl(upperStr2);
  
  const union = [];
  const intersection = [];
  
  
  for (let i = 0; i < arrStr1.length; i++) {
    if (arrStr2.indexOf(arrStr1[i]) >= 0) {
      // splice 함수를 사용하여 arrStr2 배열에서 arrStr1 배열과 중복되는 부분을 제거
      intersection.push(arrStr2.splice(arrStr2.indexOf(arrStr1[i]), 1))
    }
    union.push(arrStr1[i])
  }

  for (let i = 0; i < arrStr2.length; i++) {
    // 중복되는 인자가 제거된 arrStr2의 배열을 union 배열에 추가
    union.push(arrStr2[i])
  }
  
  // 정답 계산식
  answer = parseInt(65536 * (intersection.length / union.length));
  // 두 집합이 공배열일 경우 처리
  if(isNaN(answer)) return 65536;
  return answer;
}

// 문자열을 2글자 단위로 쪼개기 위한 함수
function splitEl(str) {
  const splitedArr = [];
  const reg = /^[A-Z]{2}/g
  
  for(let i = 0; i < str.length -1; i++) {
      const newEl = str.split('')[i] + str.split('')[i+1];
      if(newEl.match(reg) !== null) {
          splitedArr.push(newEl)
      }
  }
  return splitedArr;
}
