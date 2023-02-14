import java.util.Arrays;
import java.util.List;

public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i += 1) {
            nums[i] = nums[i - 1] + nums[i];
        }

        return nums;
    }
}
