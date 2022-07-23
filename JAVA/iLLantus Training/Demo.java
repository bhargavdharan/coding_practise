import java.util.*;
class Prob1{
    public static void main(String[] args) {
        int n = 6;
        if(n%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}

class Prob2 {
    public static void main(String[] args) {
        int n = 18;
        if (n > 0) {
            if (n >= 18) {
                System.out.println("You are eligible for voting");
            } else {
                System.out.println("You are not eligible for voting");
            }
        } else {
            System.out.println("You are not eligible for voting");
        }
    }
}

class Prob3{
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 0; i <=20 ; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}

class Prob4 {
    public static void main(String[] args) {
        int num[] = { 10, 20, 30, 40, 50 };
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] * num[i] + " ");
        }
        System.out.println();
        System.out.println("Done");
        for(int var:num)
        {
            if (var % 2 == 0)
                System.out.print(var+" ");

        }
    }
}

class Prob5 {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1,1 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        if ((sum / arr[0]) == arr.length) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}