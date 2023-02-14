import java.util.Scanner;

public class EvenAndOdd {
    public String solution(int num) {
        String answer = "";
        String evenNumber = "Even";
        String oddNumber = "Odd";

        if (num % 2 == 0 || num == 0) {
            answer = evenNumber;
        }

        if (num % 2 != 0) {
            answer = oddNumber;
        }

        return answer;
    }
}
