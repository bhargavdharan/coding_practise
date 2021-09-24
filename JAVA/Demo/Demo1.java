class Demo1 {
    public static void main(String[] args) {
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
    }
}

class Looping {
    public static void main(String[] args) {
        for (int i = 0; i < 500; i++) {
            // System.out.println("*");
            System.out.print("*");
        }
    }
}

class pattern1 {
    public static void main(String[] args) {
        // create 5 rows
        for (int i = 0; i < 5; i++) {
            // print 5 stars in a row
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            // take cursor to new line
            System.out.println();
        }
    }
}

class pattern2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }
}

class pattern3 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }
}

class pattern4 {
    public static void main(String[] args) {
        System.out.println("Welcome to hollow rectangle pattern");
        int n = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == (n - 1) || j == 0 || j == (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

class pattern5 {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (count < 10) {
                    System.out.print("0");
                }
                System.out.print(count + " ");
                count += 1;
            }
            System.out.println();
        }
    }
}

class pattern6 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(j + i + 1 + " ");
            }
            System.out.println();
        }
    }
}

class MegaPattern {
    public static void main(String[] args) {
        int n = 17;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == j || i + j == n - 1 || i + j == n / 2 || i - j == n / 2 || i + j == (n - 1) + (n / 2)
                        || j - i == n / 2 || i == n / 2 || j == n / 2 || i == (n - 1) || j == 0 || j == (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}