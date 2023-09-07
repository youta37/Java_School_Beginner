import java.util.Scanner;

public class ComprehensiveBeginner01_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int inputNum = scanner.nextInt();

        if (inputNum % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        scanner.close();

    }
}
