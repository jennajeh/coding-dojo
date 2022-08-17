import java.util.Scanner;

public class LeapYear {

    //윤년인지 아닌지 출력하는 프로그램
    //연도가 4의 배수이면 윤년이다.
    //연도가 4의 배수이더라도, 동시에 100의 배수이면 윤년이 아니다.
    //연도가 100의 배수이더라도, 동시에 400의 배수이면 윤년이다.
    //1900 이상 2022 이하의 자연수인 연도만 계산한다.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("연도 : ");
        int year = scanner.nextInt();

        if (year < 1900 || year > 2022) {
            System.out.println("1900 이상 ~ 2022 이하의 자연수만 가능합니다.");
            return;
        }

        boolean leapYearMultiplyFour = year % 4 == 0;
        boolean leapYearMultiplyHundred = year % 100 == 0;
        boolean leapYearMultiplyFourHundred = year % 400 == 0;

        if (leapYearMultiplyFour || leapYearMultiplyHundred) {
            if (leapYearMultiplyFourHundred) {
                System.out.println("true");
            }
        }

        if (!leapYearMultiplyFour || leapYearMultiplyHundred) {
            if (!leapYearMultiplyFourHundred)
                System.out.println("false");
        }
    }
}
