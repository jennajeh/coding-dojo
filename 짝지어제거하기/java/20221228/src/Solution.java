import java.util.Stack;

class Solution {
    public int solution(String s) {
        //test(); 콘솔 테스트용 메서드

        int answer = removeDuplicates(s);

        return answer;
    }

    public int removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();

                continue;
            }

            stack.push(c);
        }

        return stack.isEmpty() ? 1 : 0;
    }

    public void test() {
        System.out.println("removeDuplicates(\"baabaa\") : 1 --> " + removeDuplicates("baabaa"));
        System.out.println("removeDuplicates(\"cdcd\") : 0 --> " + removeDuplicates("cdcd"));
    }
}
