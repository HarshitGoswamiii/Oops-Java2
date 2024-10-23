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
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public void pattern4() { // Inverted Half Triangle
        for (int i = 4; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public void pattern5() { // Inverted Left Half Pyramid
        int a = 4;
        for (int i = 1; i <= a; i++) {
            for (int b = 1; b <= (a - i); b++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void pattern6() { // Half Pyramid with Numbers
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void pattern7() { // Inverted Half Pyramid with Numbers
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void pattern8() { // Floyd Triangle
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public void pattern9() { // 0 1 Triangle
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else if ((i + j) % 2 == 1) {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public void pattern10() { // Butterfly pattern
        int n = 4;

        // UPPER HALF
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) { // For Printing stars
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) { // For Printing stars
                System.out.print("*");
            }
            System.out.println();
        }

        // LOWER HALF
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) { // For Printing stars
                System.out.print("*");
            }
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) { // For Printing stars
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern11() { // Solid Rhombus
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern12() { // Number Pyramid
        int n = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void pattern13() { // Palindromic Pyramid Pattern
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Ist Half
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // IInd Half
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void pattern14() { // Diamond Pattern
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
        }
    }
}

public class pattern {
    public static void main(String[] args) {
        patterning ptr = new patterning();
        ptr.pattern14();
    }
}
