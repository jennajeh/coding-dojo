import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        return String.format("김서방은 %d에 있다", Arrays.asList(seoul).indexOf("kim"));
    }
}
