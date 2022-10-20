class Solution {
    public String solution(String s) {
        String answer = toUpperCase(splitWord(s));

        return answer;
    }

    public String[] splitWord(String s) {
        String[] array = s.split("");

        return array;
    }

    public String toUpperCase(String[] words) {
        int index = 0;
        String answer = "";

        for (String word : words) {
            index = word.contains(" ") ? 0 : index + 1;
            answer += index % 2 == 0 ? word.toLowerCase() : word.toUpperCase();
        }

        return answer;
    }
}
