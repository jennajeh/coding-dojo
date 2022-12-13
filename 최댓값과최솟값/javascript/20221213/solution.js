function test() {
  console.log('min([1, 2, 3, 4]) : 1 === ' 
              + min("1 2 3 4"));
  
  console.log('max([1, 2, 3, 4]) : 4 === ' 
              + max("1 2 3 4"));
  
  console.log('findMinAndMax("1 2 3 4") : "1 4" === ' 
              + findMinAndMax("1 2 3 4"));
}

function solution(s) {
  const answer = findMinAndMax(s);
  
  return answer;
}

function min(s) {
  return Math.min(...s.split(' '));
}

function max(s) {
  return Math.max(...s.split(' '));
}

function findMinAndMax(s) {
  return min(s) + " " + max(s);
}

test();
