import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        int answer = process(nums);

        return answer;
    }

    public int process(int[] nums) {
        int max = nums.length / 2;

        if (removeDuplicate(nums) > max) {
            return max;
        }

        return removeDuplicate(nums);
    }

    public int removeDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        Arrays.stream(nums)
                .forEach(number -> set.add(number));

        return set.size();
    }
}
