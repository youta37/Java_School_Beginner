public class ComprehensiveBeginner01_06 {
    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {

            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("foobar");
            } else if (num % 3 == 0) {
                System.out.println("foo");
            } else if (num % 5 == 0) {
                System.out.println("bar");
            } else {
                System.out.println(num);
            }
        }
    }

}
