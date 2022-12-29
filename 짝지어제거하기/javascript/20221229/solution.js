function solution(s) {
    const stack = [];
    
    for (let i = 0; i < s.length; i += 1) {
        if (!stack.length || stack[stack.length - 1] !== s[i]) {
            stack.push(s[i]);
            
            continue;
        }
        
        stack.pop();
    }

    return stack.length ? 0 : 1;
}

//test();

function test() {
    console.log('solution("baabaa") : 1 --> ' + solution("baabaa"));
    console.log('solution("cdcd") : 0 --> ' + solution("cdcd"));
}
