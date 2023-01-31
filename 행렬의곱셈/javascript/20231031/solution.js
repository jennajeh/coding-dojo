// 3중 for 문 활용한 풀이
function solution(arr1, arr2) {
  var answer = [];
  arr1.forEach(row => answer.push(Array(arr2[0].length).fill(0)));

  for(let i = 0; i < arr1.length; i++) {
      for(let j = 0; j < arr2[0].length; j++) {
          for(let k = 0; k < arr2.length; k++) {
              answer[i][j] += arr1[i][k] * arr2[k][j];
          }
      }
  }
  
  return answer;
}

// map 과 reduce 를 활용한 풀이
const solution = (arr1, arr2) => {
  // arr1의 행마다
  return arr1.map((row) =>
      // arr2의 열의 개수만큼 연산을 진행
      arr2[0].map((_, cIdx) =>
          // arr1의 i행에서 열의 인덱스 == arr2의 j열에서 행의 인덱스(rIdx)인 같은 원소끼리 곱하여 더해주기
          // acc는 reduce문으로 더해지는 값을 저장하는 누산기 변수
          // cur은 arr1의 한 행의 현재 값으로 첫 번째 for문을 활용한 풀이에서 arr1[i][k]와 같은 값을 가리킴
          // arr2[rIdx][cIdx]는 첫 번째 for문을 활용한 풀이에서 arr2[k][j]와 같은 값을 가리킴
          row.reduce((acc, cur, rIdx) =>
              acc + cur * arr2[rIdx][cIdx]
          , 0)
      )
  );
}
