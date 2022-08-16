import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("BMI 측정기");
        System.out.print("신장(m) : ");
        double height = sc.nextDouble();
        System.out.print("체중(kg) : ");
        double weight = sc.nextDouble();
        double bmiResult = weight/(height * height);

        System.out.print("비만도 결과 : ");

        if(bmiResult <= 18.5) {
            System.out.println("저체중");
        }

        if(18.5 < bmiResult && bmiResult <= 23) {
            System.out.println("정상");
        }

        if(23 < bmiResult && bmiResult <= 25) {
            System.out.println("과체중");
        }

        if(25 < bmiResult) {
            System.out.println("비만");
        }

        System.out.println("BMI : " + bmiResult);

        sc.close();
    }
}
