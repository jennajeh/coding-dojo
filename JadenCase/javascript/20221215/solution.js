function test() {
    console.log('3people unFollowed me --> ' + '3people unFollowed me'.split(''));
    console.log('for the last week --> ' + solution('for the last week'));
}

function solution(s) {
      const words = s.split(' ')
        .map(word => word.substr(0, 1).toUpperCase() + word.substr(1).toLowerCase());

    return words.join(' ');
}    

test();
