package Assignment1;

// pattern-1

class pattern1 {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (i == j) {
                    
                    System.out.print(j + " ");
                } else {
                    System.out.print("1" + " ");
                }
            }
            System.out.println();
        }
    }
}

// output-1
// 1 1 1 1 1 
// 1 2 1 1 1 
// 1 1 3 1 1 
// 1 1 1 4 1 
// 1 1 1 1 5 

// pattern-2

class pattern2 {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        for (i = 1; i <= n; i++) {

            for (j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("1" + " ");
                }
            }
            System.out.println();
        }
    }
}

// output-2
// 1 1 1 1 1 
// 1 2 1 1 1 
// 1 2 3 1 1 
// 1 2 3 4 1 
// 1 2 3 4 5 

// pattern-3
class pattern3 {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for(j=1;j<=n;j++){
                if (j <= i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("1" + " ");
                }
            }
            System.out.println();
        }
    }
}

// output-3
// 1 1 1 1 1 
// 2 2 1 1 1 
// 3 3 3 1 1 
// 4 4 4 4 1 
// 5 5 5 5 5 

// pattern-4
class pattern4 {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print(n - i + 1 + " ");
            }
            System.out.println();
        }
    }
}

// output-4
// 5 5 5 5 5 
// 4 4 4 4 4 
// 3 3 3 3 3 
// 2 2 2 2 2 
// 1 1 1 1 1 

// pattern-5
class pattern5 {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print(n-j+1+" ");
            }
            System.out.println();
        }
    }
}

// output-5
// 5 4 3 2 1 
// 5 4 3 2 1 
// 5 4 3 2 1 
// 5 4 3 2 1 
// 5 4 3 2 1 

// pattern-6
class pattern6 {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }
}

// output-6
// 1 0 1 0 1 
// 0 1 0 1 0 
// 1 0 1 0 1 
// 0 1 0 1 0 
// 1 0 1 0 1 

// pattern-7
class pattern7 {
    public static void main(String[] args) {
        int i, j,k;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (k = 1; k <= i-1; k++) {
                System.out.print("0" + " ");
            }
            for (j = 1; j <= n-i+1; j++) {
                System.out.print("1" + " ");
            }
            System.out.println();
        }
    }
}

// output-7
// 1 1 1 1 1 
// 0 1 1 1 1 
// 0 0 1 1 1 
// 0 0 0 1 1 
// 0 0 0 0 1 

// pattern-8
class pattern8 {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (i == j) {

                    System.out.print(j + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }
}

// output-8
// 1 0 0 0 0 
// 0 2 0 0 0 
// 0 0 3 0 0 
// 0 0 0 4 0 
// 0 0 0 0 5 

// pattern-9
class pattern9 {
    public static void main(String[] args) {
        int i, j, k;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (k = 1; k <= n - i + 1; k++) {
                System.out.print("-" + " ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

// output-9
// - - - - - 1 
// - - - - 1 2 
// - - - 1 2 3 
// - - 1 2 3 4 
// - 1 2 3 4 5
