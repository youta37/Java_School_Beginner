import java.util.Scanner;

public class ComprehensiveBeginner01_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a=");
        int a = scanner.nextInt();

        System.out.print("b=");
        int b = scanner.nextInt();

        System.out.print("c=");
        int c = scanner.nextInt();

        int D = b * b - 4 * a * c;

        if (D > 0) {
            System.out.println("2つの実数解");
        } else if (D == 0) {
            System.out.println("重解");
        } else {
            System.out.println("2つの虚数解");
        }
        scanner.close();
    }

}
