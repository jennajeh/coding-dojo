import java.util.Stack;

class Solution {
    public boolean isRight(char[] arr){
        Stack<Character> st = new Stack<Character>();
        for(int i = 0; i < arr.length; i++){
            char cur = arr[i];
            if(i == 0) {
                // 첫 번째 문자가 닫는 괄호일 경우 바로 false 리턴
                if(cur == ']' || cur == '}' || cur == ')') return false;
                // 첫 번째 문자는 일단 Stack에 넣는다.
                st.push(cur);
                continue;
            }

            // 스택에 아무것도 없으면 push!
            if(st.isEmpty()) {
                st.push(cur);
                continue;
            }

            // peek한 문자가 여는 괄호이고 현재 문자가 매칭되는 닫는 괄호이면 peek한 문자를 Stack에서 제거한다.
            char elem = st.peek();
            if(elem == '(' && cur == ')'|| elem == '[' && cur == ']'|| elem == '{' && cur == '}') {
                st.pop();
            } else {
                // 매칭 되지 않으면 현재 문자를 Stack에 넣어야 한다.
                // {([])} 이런 괄호가 있을 수 있기 떄문에
                st.push(cur);
            }
        }

        return st.isEmpty() ? true : false;
    }

    public int solution(String s) {
        int answer = 0;
        int len = s.length();
        for(int i = 0; i < len; i++){
            // substring으로 두 번쨰 문자부터 시작하는 문자열에 + 첫번 째 문자를 붙인다.
            s = s.substring(1, len) + s.substring(0,1);
            if(isRight(s.toCharArray())) answer++;

        }
        return answer;
    }
}
