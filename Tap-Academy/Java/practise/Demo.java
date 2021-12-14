package Java.practise;

import java.util.Scanner;

// Demo Pattern-1
class Demo1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("*");
        }
    }
}

// output1
// *
// *
// *
// *
// *

// Demo pattern-2
// printing same stars on the same line
class Demo01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print("*" + " ");
        }
    }
}

// output1.1
// * * * * *

// pattern-2

class Demo2 {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}

// output2
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *


// pattern-3

class Demo3 {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*" +" ");
                // System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}

// output-3
// *
// * *
// * * *
// * * * *
// * * * * *

// pattern-4

class Demo4{
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i + 1; j++) {
                // System.out.print(i + " ");
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

// output-4
// * * * * *
// * * * *
// * * *
// * *
// *

// pattern-5

class Demo5{
    public static void main(String[] args) {
        int i, j, k;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (k = 1; k <= n; k++) {
                System.out.print("-"+" ");
            }
            for (j = 1; j <= n; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

// output5
// - - - - - * * * * *
// - - - - - * * * * *
// - - - - - * * * * *
// - - - - - * * * * *
// - - - - - * * * * *

// pattern-6
class Demo6 {
    public static void main(String[] args) {
        int i, j, k;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (k = 1; k <= n - i+1; k++) {
                System.out.print("-" + " ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

// output6
// - - - - - *
// - - - - * *
// - - - * * *
// - - * * * *
// - * * * * *

// pattern-7

class Demo7 {
    public static void main(String[] args) {
        int i, j, k;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (k = 1; k <= i; k++) {
                System.out.print("-"+" ");
            }
            for (j = 1; j <= n - i + 1; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

// output7
// - * * * * * 
// - - * * * * 
// - - - * * * 
// - - - - * * 
// - - - - - * 


// pattern-8

class Demo8 {
    public static void main(String[] args) {
        int i, j, k;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (k = 1; k <= i; k++) {
                System.out.print("-" + " ");
            }
            for (j = 1; j <= n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

// output-8
// - * * * * * 
// - - * * * * * 
// - - - * * * * * 
// - - - - * * * * * 
// - - - - - * * * * *

// pattern-9

class Demo9 {
    public static void main(String[] args) {
        int i, j, k;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (k = 1; k <= n - i + 1; k++) {
                System.out.print("-" + " ");
            }
            for (j = 1; j <= n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

// output-9
// - * * * * * 
// - - * * * * * 
// - - - * * * * * 
// - - - - * * * * * 
// - - - - - * * * * *

// pattern-10
class Demo10 {
    public static void main(String[] args) {
        int i, j, k;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (k = 1; k <= n - i + 1; k++) {
                System.out.print("-" + " ");
            }
            for (j = 1; j <= 2*i-1; j++) {
                    System.out.print("*" + " ");
               
            }
            System.out.println();
        }
    }
}

// output-10
// - - - - - * 
// - - - - * * * 
// - - - * * * * * 
// - - * * * * * * * 
// - * * * * * * * * *

// pattern-11
class Demo11 {
    public static void main(String[] args) {
        int i, j, k;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (k = 1; k <= i; k++) {
                System.out.print("-" + " ");
            }
            for (j = 1; j <= 11-2*i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

// output-11
// - * * * * * * * * * 
// - - * * * * * * * 
// - - - * * * * * 
// - - - - * * * 
// - - - - - *

// pattern-12
class Demo12 {
    public static void main(String[] args) {
        int i, j, k;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (k = 1; k <= n; k++) {
                System.out.print("-" + " ");
            }
            for (j = 1; j <= n; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}

// output-12
// - - - - - * * * * * 
// - - - - - *       * 
// - - - - - *       * 
// - - - - - *       * 
// - - - - - * * * * *

// pattern-13
class Demo13 {
    public static void main(String[] args) {
        int i, j, k;
        int n = 5;
        
    }
}