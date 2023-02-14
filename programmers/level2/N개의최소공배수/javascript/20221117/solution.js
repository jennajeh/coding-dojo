function test() {
  console.log(`lcm([2,6,8,14]) : 168 = ${lcm([2, 6, 8, 14])}`);
  console.log(`lcm([1,2,3]) : 6 = ${lcm([1, 2, 3])}`);
}

function gcd(a, b) {
  const c = a % b;

  if (c === 0) {
    return b;
  }

  return gcd(b, c);
}

function lcm(arr) {
  let answer = 0;

  if (arr.length === 1) {
    return arr[0];
  } 

  let getGcd = gcd(arr[0], arr[1]);

  answer = (arr[0] * arr[1]) / getGcd;

  if (arr.length > 2) {
    for (let i = 2; i < arr.length; i += 1) {
      getGcd = gcd(answer, arr[i]);

      answer = (answer * arr[i]) / getGcd;
    }
  }

  return answer;
}

function solution(arr) {
    let answer = lcm(arr);

    return answer;
}

//test();
