export default function solution(board, moves) {
  const answer = [];

  let count = 0;

  for (let i = 0; i < moves.length; i += 1) {
    for (let j = 0; j < board.length; j += 1) {
      if (board[j][moves[i] - 1] > 0) {
        if (answer[answer.length - 1] === board[j][moves[i] - 1]) {
          answer.pop();

          count += 2;

          board[j][moves[i] - 1] = 0;

          break;
        }
        answer.push(board[j][moves[i] - 1]);

        board[j][moves[i] - 1] = 0;

        break;
      }
    }
  }

  return count;
}
