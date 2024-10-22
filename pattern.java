class patterning {

    public void pattern1() { // Rectangle Pattern
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern2() { // Hollow Rectangle
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 1 || j == 1 || i == 4 || j == 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void pattern3() { // Half Pyramid
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");   
            }
            System.out.println("");
        }
    }
}

public class pattern {
    public static void main(String[] args) {
        patterning ptr = new patterning();
        ptr.pattern3();
    }
}
