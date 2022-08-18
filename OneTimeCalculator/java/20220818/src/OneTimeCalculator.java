import java.util.Scanner;

public class OneTimeCalculator {
    /*
    * 한 번만 계산되는 일회용 계산기
    *   - 연산할 숫자들을 입력한다.
    *   - 번호를 입력해 연산자를 선택할 수 있다.
    *   - 선택한 숫자와 연산자로 계산된 결과를 확인할 수 있다.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("급할 때 사용하는 일회용 계산기 숫자를 입력해 주세요 :");
        double number1 = scanner.nextDouble();

        System.out.println("연산자를 선택해 주세요 :");
        System.out.println("1. + (더하기)");
        System.out.println("2. - (빼기)");
        System.out.println("3. * (곱하기)");
        System.out.println("4. / (나누기)");
        int action = scanner.nextInt();

        System.out.println("숫자를 입력해 주세요 :");
        Double number2 = scanner.nextDouble();

        if(action == 1) {
            double result = number1 + number2;
            System.out.println("계산 결과 : " + result);
        }

        if(action == 2) {
            double result = number1 - number2;
            System.out.println("계산 결과 : " + result);
        }

        if(action == 3) {
            double result = number1 * number2;
            System.out.println("계산 결과 : " + result);
        }

        if(action == 4) {
            double result = number1 / number2;
            System.out.println("계산 결과 : " + result);
        }

        scanner.close();
    }
}
