function test() {
    console.log('solution(10, 2) : [4, 3] --> ' + solution(10, 2));
    console.log('solution(8, 1) : [3, 3] --> ' + solution(8, 1));
    console.log('solution(24, 24) : [8, 6] --> ' + solution(24, 24));
}

function solution(brown, yellow) {
    const answer = [];
    const sum = brown + yellow;

    for (let i = 1; i <= sum; i += 1) {
        const row = i;
        const col = sum / row;

        if (row > col) {
            continue;
        }

        if ((row - 2) * (col - 2) == yellow) {
            answer[0] = col;
            answer[1] = row;
            break;
        }
    }

    return answer;
}
