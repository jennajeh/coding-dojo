import java.util.Scanner;

public class Big3Printer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String toDo1;
        String toDo2;
        String toDo3;

        System.out.print("할 일1: ");
        toDo1 = sc.nextLine();

        System.out.print("할 일2: ");
        toDo2 = sc.nextLine();

        System.out.print("할 일3: ");
        toDo3 = sc.nextLine();

        System.out.println();
        System.out.println("오늘의 할 일 Big3는");
        System.out.println("1. " + toDo1);
        System.out.println("2. " + toDo2);
        System.out.println("3. " + toDo3);

        sc.close();


    }
}
