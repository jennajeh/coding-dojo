import java.text.DecimalFormat;
import java.util.Scanner;

public class SavingCalculator {
    /*
     * 적금 이자 계산기
     * - 금리에 따라 적금 이자를 얼마나 받을 수 있는지 알 수 있는 계산기 프로그램
     * - 원금 합계란, 이자 수익을 제외한 적립액의 합계를 말한다.
     * - 세후 이자란, 이자의 세금을 이자에서 제외한 금액을 말한다.
     *   - 이자에 대한 세금은 15.4% 로 계산한다.
     * - 총 수령액은 세후 총 수령액을 말한다.
     * - 세전 총 수령액은 이자를 복리로 계산한 원리합계(원금과 이자의 합계)이다.
     * - 세전 총 수령액(원금과 이자의 합계) 구하는 공식
     *   a * (1 + r) * ((1 + r)^m - 1 ) / r
     *   a = 월 적립금
     *   r = 연이자율 / 12
     *   m = 총 적금기간(월)
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("###,###");

        System.out.println("적금 이자 계산기");
        System.out.println("월 적립액을 입력해 주세요.(단위:원) : ");
        int monthlyDeposit = scanner.nextInt();

        System.out.println("적금 기간을 입력해 주세요. (단위:년) :");
        int savingsPeriod = scanner.nextInt();

        System.out.println("연이자율을 입력해 주세요. (단위:%) : ");
        double savingsRate = scanner.nextDouble();

        //연 이자율
        double calcSavingRate = savingsRate * 0.01 / 12;

        //세전 총 수령액
        int beforeTax = (int) (monthlyDeposit * (1 + calcSavingRate)
                * ((Math.pow(1 + calcSavingRate, (savingsPeriod * 12))) - 1) / calcSavingRate);

        //원금 합계
        int totalMonthlyDeposit = monthlyDeposit * (savingsPeriod * 12);
        String decimalTotalMonthlyDeposit = decimalFormat.format(totalMonthlyDeposit);

        //이자 수익
        int tax = beforeTax - totalMonthlyDeposit;

        //세후 이자
        double afterTax = tax - (tax * 0.154);
        String decimalAfterTax = decimalFormat.format(Math.ceil(afterTax));

        //세후 총 수령액
        double totalAmount = totalMonthlyDeposit + afterTax;
        String decimalTotalAmount = decimalFormat.format(Math.ceil(totalAmount));

        System.out.println("원금합계: " + decimalTotalMonthlyDeposit + "원");
        System.out.println("세후이자: " + decimalAfterTax + "원");
        System.out.println("세후 총 수령액: " + decimalTotalAmount + "원");
    }
}
