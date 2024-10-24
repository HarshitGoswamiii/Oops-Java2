public class Practice1 {
    public static void Pattern1() { // Right Triangle and Right Downward Triangle
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    public static void Pascal() { // Left Pascal Triangle
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 3; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void Pattern2() { // Pyramid , Left Triangle
        int a = 4;
        for (int k = 0; k < a; k++) {
            for (int i = 1; i <= (a - k - 1); i++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= k; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void Pascal2() {
        int a = 4;
        for (int i = 0; i < a; i++) {
            for (int b = 1; b <= (a - i - 1); b++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for (int i = 3; i >= 1; i--) {
            for (int b = 4; b > i; b--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Pattern Reverse
        // Pattern1();

        // Pattern2();

        // Pascal();

        Pascal2();
    }
}