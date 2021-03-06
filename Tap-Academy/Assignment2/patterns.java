package Assignment2;


// pattern-1

class pattern1 {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        int ch = 64;
        for (i = 1; i <= n; i++) {
            int c = ch + i;
            for (j = 1; j <= n - i + 1; j++) {
                System.out.print((char) (c) + " ");
                c++;
            }
            System.out.println();
        }

    }
}

// output-1
// A B C D E 
// B C D E 
// C D E 
// D E 
// E 


// pattern-2
class pattern2 {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        int ch = 68;
        for (i = 1; i <= n; i++) {
            for (j = 0; j < n - i + 1; j++) {
                System.out.print((char) (ch-j+1) + " ");
                
            }
            System.out.println();
        }
    }
}

// output-2
// E D C B A 
// E D C B 
// E D C 
// E D 
// E 

// pattern-3
class pattern3 {
    public static void main(String[] args) {
        int i, j, k;
        int n = 5;
        int ch = 64;
        for (i = 1; i <= n; i++) {
            for (k = 1; k <= n - i + 1; k++) {
                System.out.print("-" + " ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print((char)(ch+i) +" ");
            }
            System.out.println();
        }
    }
}

// output-3
// - - - - - A 
// - - - - B B B 
// - - - C C C C C 
// - - D D D D D D D 
// - E E E E E E E E E 

// pattern-4
class pattern4 {
    public static void main(String[] args) {
        int i, j, k;
        int n = 5;
        int ch = 65;
        for (i = 1; i <= n; i++) {
            int c = ch + (2*i) - 2;
            for (k = 1; k <= n - i + 1; k++) {
                System.out.print("-" + " ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                    System.out.print((char) (c) + " ");
                    c--;
            }
            System.out.println();
        }
    }
}

// output-4
// - - - - - A 
// - - - - C B A 
// - - - E D C B A 
// - - G F E D C B A 
// - I H G F E D C B A 

// pattern-5
class pattern5 {
    public static void main(String[] args) {
        int i, j, k;
        int n = 5;
        int ch = 69;
        for (i = 1; i <= n; i++) {
            for (k = 1; k < n - i + 1; k++) {
                System.out.print("-" + " ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print((char) (ch - i + 1) + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
        for (i = 2; i <= n; i++) {
            int ch2 = 65;
            for (k = 1; k < i; k++) {
                System.out.print("-" + " ");
            }
            for (j = 1; j <= 11 - (2 * i); j++) {
                if (j == 1 || j == 11 - (2 * i)) {
                    System.out.print((char) (ch + i - 1) + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}

// output-5
// - - - - E 
// - - - D   D 
// - - C       C 
// - B           B 
// A               A 
// - F           F 
// - - G       G 
// - - - H   H 
// - - - - I 

// pattern-6
class pattern6 {
    public static void main(String[] args) {
        int i, j, k;
        int n = 5;
        for (i = 1; i <= 5; i++) {
            int ch = 65 + n - i;
            for (k = 1; k < n - i + 1; k++) {
                System.out.print("-" + " ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print((char) (ch)++ + " ");
            }

            System.out.println();
        }
    }
}

// output-6
// - - - - E 
// - - - D E 
// - - C D E 
// - B C D E 
// A B C D E 


// pattern-7
class pattern7 {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        int count = 0;
        for (i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                count = (i * (i + 1)) / 2;
                for (j = 1; j <= i; j++) {
                    System.out.print(count - j + 1 + " ");

                }
            } else {

                for (j = 1; j <= i; j++) {
                    System.out.print(count + j + " ");

                }
            }
            System.out.println();
        }
    }
}

// output-7
// 1 
// 3 2 
// 4 5 6 
// 10 9 8 7 
// 11 12 13 14 15 

// pattern-8
class pattern8 {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        int ch = 65;
        for (i = 1; i <= n; i++) {
            int c = ch + n - i;
            for (j = 1; j <= n - i + 1; j++) {
                System.out.print((char) (c) + " ");

            }
            System.out.println();
        }
    }
}

// output-8
// E E E E E 
// D D D D 
// C C C 
// B B 
// A 


// pattern-9
class pattern9 {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        int ch = 64;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print((char) (ch + j) + " ");
            }
            System.out.println();
        }

    }
}

// output-9
// A B C D E 
// A B C D E 
// A B C D E 
// A B C D E 
// A B C D E 

// pattern-10

class pattern10 {
    public static void main(String[] args) {
        int i, j, k;
        int n = 5;
        int ch = 64;
        for (i = 1; i <= n; i++) {
            int c = ch + i;
            for (k = 1; k <= i; k++) {
                System.out.print("-" + " ");
            }
            for (j = 1; j <= n - i + 1; j++) {
                System.out.print((char) (c) + " ");
                c++;
            }
            System.out.println();
        }

    }
}

// output-10
// - A B C D E 
// - - B C D E 
// - - - C D E 
// - - - - D E 
// - - - - - E 
