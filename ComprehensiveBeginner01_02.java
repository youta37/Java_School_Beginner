import java.util.Scanner;

public class ComprehensiveBeginner01_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        int inputNum1 = scanner.nextInt();

        System.out.print("");
        int inputNum2 = scanner.nextInt();

        System.out.print("");
        int inputNum3 = scanner.nextInt();

        if (inputNum1 <= inputNum2 && inputNum2 <= inputNum3) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
        scanner.close();

    }

}
