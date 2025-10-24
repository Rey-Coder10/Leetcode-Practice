package Basics;

class Patterns {

    // pattern 1
    public void pat1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // pattern 2
    public void pat2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    // pattern 3
    public void pat3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    // pattern 4
    public void pat4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }

    // pattern 5
    public void pat5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    // pattern 6
    public void pat6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n - i + 2; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    // pattern 7
    public void pat7(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // space

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // pattern 8
    public void pat8(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j < (2 * n) - (2 * i); j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // pattern 9
    public void pat9(int n) {
        // Upper part code
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // space

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        // Bottom part code
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 0; j < 2 * 5 - 2 * i - 1; j++) {
                System.out.print("*");
            }

            // space

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // pattern 10
    public void pat10(int n) {
        // First half of the triangle
        for (int i = 0; i < n; i++) {
            // star
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + "");
            }
            System.out.println();
        }
        // Second half of the triangle
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + "");
            }
            System.out.println();
        }

    }

    // pattern 11
    public void pat11(int n) {
        int start = 1;
        // First half of the triangle
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                start = 1;
            else
                start = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    // pattern 12
    public void pat12(int n) {
        for (int i = 1; i < n; i++) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // space
            for (int j = 1; j <= 2 * (n - i) - 2; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // pattern 13
    public void pat13(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num + 1;
            }
            System.out.println();
        }
    }

    // pattern 15
    public void pat15(int n) {
        for (int i = 1; i <= n; i++) {
            for (char j = 'A'; j <= 'A' + (n - i - 1); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // pattern 16
    public void pat16(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ((int) ('A' + i)) + " ");
            }
            System.out.println();
        }
    }

    // pattern 19
    public void pat19(int n) {
        // part 1
        for (int i = 1; i <= n; i++) {
            // star
            for (int j = n; j >= i; j--) {
                System.out.print("*" + "");
            }
            // space
            int space = 2 * (i - 1);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = n; j >= i; j--) {
                System.out.print("*" + "");
            }
            System.out.println();
        }
        // part 2
        for (int i = 1; i <= n; i++) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + "");
            }
            // space
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + "");
            }
            System.out.println();
        }
    }

    // pattern 20
    public void pat20(int n) {
        // First half of the Right hand triangle
        for (int i = 1; i <= n; i++) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + "");
            }
            // space
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + "");
            }
            System.out.println();
        }
        // Second half of the triangle
        for (int i = n; i >= 1; i--) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + "");
            }
            // space
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + "");
            }
            System.out.println();
        }
    }

    // pattern 21
    public void pat21(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (i == 1 || j == 1 || i == 4 || j == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // pattern 22
    public void pat22(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int bottom = j;
                int right = (2 * n - 2) - j;
                int left = (2 * n - 2) - i;
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Patterns p = new Patterns();
        p.pat1(5);
        p.pat2(5);
        p.pat3(5);
        p.pat4(5);
        p.pat5(5);
        p.pat6(5);
        p.pat7(5);
        p.pat8(5);
        p.pat9(5);
        p.pat10(5);
        p.pat11(5);
        p.pat12(5);
        p.pat13(5);
        p.pat15(5);
        p.pat16(5);
        p.pat19(5);
        p.pat20(5);
        p.pat21(5);
        p.pat22(5);

    }
}
