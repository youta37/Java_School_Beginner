public class ComprehensiveBeginner01_05 {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int answer = i * j;
                System.out.print(" ");

                if (answer < 10) {
                    System.out.print(" ");
                }
                System.out.print(answer);
            }
            System.out.println();
        }
    }

}
