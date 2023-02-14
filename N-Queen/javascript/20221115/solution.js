const array = [];
let count = 0;

function isPossible(row) {
  for (let i = 0; i < row; i += 1) {
    if (array[row] === array[i]) {
      return false;
    }

    if (Math.abs(row - i) === Math.abs(array[row]- array[i])) {
      return false;
    }
  }

  return true;
}

function findQueenRoute(n, row) {
  if (row === n) {
    count += 1;
      
    return;
  }

  for (let i = 0; i < n; i += 1) {
    array[row] = i;

    if (isPossible(row)) {
      findQueenRoute(n, row + 1);
    }
  }
}

function solution(n) {
  findQueenRoute(n, 0);

  return count;
}
