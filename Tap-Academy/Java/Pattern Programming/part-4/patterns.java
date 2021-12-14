class pattern1 {
    public static void main(String[] args) {
        int n = 5;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count = (i * (i + 1)) / 2;
            for (int j = 1; j <= i; j++) {
                System.out.print(count - j + 1 + " ");
            }
            System.out.println();
        }
    }
}

// output

// 1 
// 3 2 
// 6 5 4 
// 10 9 8 7 
// 15 14 13 12 11 

class pattern2 {
    public static void main(String[] args) {
        int n = 5;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                
                count = (i * (i + 1)) / 2;
                for (int j = 1; j <= i; j++) {
                    System.out.print(count - j + 1 + " ");
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print(count + j + " ");
                }
            }
            System.out.println();
        }
    }
}

// output

// 1 
// 3 2 
// 4 5 6 
// 10 9 8 7 
// 11 12 13 14 15 

class pattern3 {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        char ch = 'A';
        for (i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                char chRev = (char) (ch + i - 1);
                for ( j = 1; j <= i; j++) {
                    System.out.print(chRev-- + " ");
                    ch++;
                }
            } else {
                for ( j = 1; j <= i; j++) {
                    System.out.print(ch++ + " ");

                }
            }
            System.out.println();
        }
    }
}

// A 
// C B 
// D E F 
// J I H G 
// K L M N O 

class pattern4 {
    public static void main(String[] args) {
        int i, j, k;
        int n = 5;
        char ch = 'A';
        for (i = 1; i <= n; i++) {
            for (k = 1; k <= i - 1; k++) {
                System.out.print(" " + " ");
            }
            for (j = 1; j <= n - i + 1; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }
}

// output
// A B C D E 
//   F G H I 
//     J K L 
//       M N 
//         O 

class pattern5 {
    public static void main(String[] args) {
        int i, j, k;
        int n = 5;
        int ch = 64;
        for (i = 1; i <= n; i++) {
            int c = ch + i;
            for (k = 1; k <= i - 1; k++) {
                System.out.print(" " + " ");
            }
            for (j = 1; j <= n - i + 1; j++) {
                System.out.print((char) (c) + " ");
                c++;
            }
            System.out.println();
        }
    }
}

// output-5
// A B C D E 
//   B C D E 
//     C D E 
//       D E 
//         E

class pattern6 {
    public static void main(String[] args) {
        int i, j, k;
        int n = 5;
        for (i = 1; i <= n; i++) {
            int count = i;
            for (k = 1; k <= n - i + 1; k++) {
                System.out.print("-" + " ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                    if(j<i){
                        System.out.print(count--  + " ");
                    }else{
                        System.out.print(count++ + " ");
                    }
                }
                System.out.println();
            }
        }
    }

// output
// - - - - - 1 
// - - - - 2 1 2 
// - - - 3 2 1 2 3 
// - - 4 3 2 1 2 3 4 
// - 5 4 3 2 1 2 3 4 5