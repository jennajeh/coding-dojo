class Solution {
    public int solution(int n) {
        String number = "";

        while (n > 0) {
            number = (n % 3) + number;

            n /= 3;
        }

        number = new StringBuilder(number).reverse().toString();

        return Integer.parseInt(number, 3);
    }
}
