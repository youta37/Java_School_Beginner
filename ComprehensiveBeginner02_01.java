import java.util.Scanner;
import java.util.Random;

public class ComprehensiveBeginner02_01 {
    public static void main(String[] args) {
        System.out.println("ゾロ目で大当たり！チャンスは30回");

        Scanner scanner = new Scanner(System.in);
        System.out.print("beginと入力してください>");
        String input = scanner.nextLine();

        if (input.equals("begin")) {
            slotMachineProgram();
        } else {
        }
        scanner.close();

    }

    public static void slotMachineProgram() {
        Random random = new Random();

        for (int i = 1; i <= 30; i++) {
            int num1 = random.nextInt(9) + 1;
            int num2 = random.nextInt(9) + 1;
            int num3 = random.nextInt(9) + 1;

            System.out.println(i + "回目:" + num1 + num2 + num3);

            if (num1 == num2 && num2 == num3) {
                System.out.println(i + "回目で大当たりです。おめでとうございます！");
                return;
            }
        }
        System.out.println("残念でした。終わります。");
    }

}
