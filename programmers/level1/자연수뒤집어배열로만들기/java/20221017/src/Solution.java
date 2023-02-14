import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

class Solution {
    public int[] solution(long n) {
        List<Integer> list = makeList(n);

        Collections.reverse(list);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public List<Integer> makeList(long n) {
        List<Integer> list = Arrays.stream(String.valueOf(n).split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        return list;
    }
}
