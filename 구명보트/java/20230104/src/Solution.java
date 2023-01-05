import java.util.Arrays;

class Solution {
    public void test() {
        System.out.println("findLimit(new int[]{70, 50, 80, 50}, 100)) : 3 --> "
                + findLimit(new int[]{70, 50, 80, 50}, 100));
        System.out.println("findLimit(new int[]{70, 80, 50}, 100)) : 3 --> "
                + findLimit(new int[]{70, 80, 50}, 100));
        System.out.println("findLimit(new int[]{50, 50}, 100)) : 1 --> "
                + findLimit(new int[]{50, 50}, 100));
        System.out.println("findLimit(new int[]{50, 70, 50, 30}, 100)) : 2 --> "
                + findLimit(new int[]{50, 70, 50, 30}, 100));
    }

    public int solution(int[] people, int limit) {
        test();

        int answer = findLimit(people, limit);

        return answer;
    }

    private int findLimit(int[] people, int limit) {
        int save = 0;
        int min = 0;
        int i = people.length - 1;

        Arrays.sort(people);

        for (int max = i; min <= max; max -= 1) {
            if (people[min] + people[max] <= limit) {
                min += 1;
            }

            save += 1;
        }

        return save;
    }
}
