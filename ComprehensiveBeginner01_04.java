import java.util.Scanner;

public class ComprehensiveBeginner01_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("人数=");
        int people = scanner.nextInt();

        int total;

        if (people >= 20) {
            total = people * 500;
        } else if (people >= 5) {
            total = people * 550;
        } else {
            total = people * 600;
        }
        System.out.println("合計：" + total);
        scanner.close();
    }

}
