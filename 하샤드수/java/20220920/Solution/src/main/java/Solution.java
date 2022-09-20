class Solution {
    public boolean solution(int x) {
        int sum = splitNumber(x);

        return isHarshad(x, sum);
    }

    public int splitNumber(int x) {
        String number = new StringBuilder().append("").append(x).toString();

        String[] numbers = number.split("");

        int sum = 0;

        for (int i = 0; i < numbers.length; i += 1) {
            sum += Integer.parseInt(numbers[i]);
        }

        return sum;
    }

    public boolean isHarshad(int x, int sum) {
        return x % sum == 0;
    }
}
