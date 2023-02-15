import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
//        <for 문 이용한 풀이>
//        for (int i = 1; i < nums.length; i += 1) {
//            nums[i] = nums[i - 1] + nums[i];
//        }
//
//        return nums;


//      <stream 이용한 풀이>
        IntStream.range(1, nums.length)
                .forEach(i -> {
                    nums[i] = nums[i - 1] + nums[i];
                });

        return nums;
    }
}
