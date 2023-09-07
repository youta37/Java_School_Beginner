import java.util.Scanner;
import java.util.Random;

public class ComprehensiveBeginner02_02 {
    public static void main(String[] args) {
        System.out.println("ジャンケン");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("0:グー 1:チョキ 2:パー > 数字を入力してください");
            int myHand = scanner.nextInt();

            if (myHand < 0 || myHand > 2) {
                System.out.println("エラーです。正しい数字を入力してください");
                continue;
            }

            Random random = new Random();
            int comHand = random.nextInt(3);

            System.out.println("MY:" + handName(myHand));
            System.out.println("COM" + handName(comHand));
            System.out.println("結果:" + jankenResult(myHand, comHand));

            scanner.close();
            break;
        }
    }

    public static String handName(int hand) {
        if (hand == 0) {
            return "グー";
        } else if (hand == 1) {
            return "チョキ";
        } else if (hand == 2) {
            return "パー";
        } else {
            return "";
        }
    }

    public static String jankenResult(int myHand, int comHand) {
        if (myHand == comHand) {
            return "あいこです";
        } else if ((myHand == 0 && comHand == 1) || (myHand == 1 && comHand == 2) || (myHand == 2 && comHand == 0)) {
            return "あなたの勝ちです";
        } else {
            return "あなたの負けです";
        }
    }
}