public class Practice1 {
    public static void Pattern1() { // Right Triangle and Right Downward Triangle
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    public static void Pattern2() {
        int a = 4;
        for (int k = 1; k <= 4; k++) {
            for (int i = 1; i <= (a - i - 1); i++) {
                System.out.print();
            }
        for (int j = 1; j <= k; j++) {
            System.out.println("* ");
        }
        System.out.println("");
        }
    }

    public static void main(String[] args) {

        // Pattern Reverse
        // Pattern1();

        Pattern2();
    }
}