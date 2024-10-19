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

    }

    public static void main(String[] args) {

        // Pattern Reverse
        Pattern1();
    }
}