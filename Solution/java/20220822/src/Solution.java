import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 0; i < b; i += 1) {
            for (int j = 0; j < a; j += 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
