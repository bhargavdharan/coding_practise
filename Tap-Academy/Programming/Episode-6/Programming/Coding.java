import java.util.Scanner;

// COUNT DIVISORS

//You have been given 3 integers - l, r and k. Find how many numbers between l and r (both inclusive) are divisible by k. You do not need to print these numbers, you just have to find their count.

class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int r = scan.nextInt();
        int k = scan.nextInt();
        // partial logic
        int count = 0;
        for (int i = l; i <= r; i++) {
            if (i%k==0) {
                count++;
            }
        }
        System.out.println(count);
        // efficient logic
        // System.out.println((r / k) - ((l - 1) / k));
    }
}

// output
// 1 10 1
// 10

// Going to office

// Alice has the following two types of taxis:

// Online taxi:
// It can be booked by using an online application from phones 
// Classic taxi:
// It can be booked anywhere on the road
//

class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // total distance from home to office destination
        int D = scan.nextInt();

        // the taxi cost for the first O(F) kms
        int oc = scan.nextInt();
        int of = scan.nextInt();
        int od = scan.nextInt();

        int onlineTaxiCost = oc + ((D - of) * od);

        // Speed of the car per minute
        int cs = scan.nextInt();
        // base price of car
        int cb = scan.nextInt();
        // cost of every minute spent in taxi
        int cm = scan.nextInt();
        // cost of each kilometer that we ride
        int cd = scan.nextInt();

        int classicTaxiCost = cb + ((D / cs) * cm) + (D * cd);

        if (onlineTaxiCost < classicTaxiCost) {
            System.out.println("Online Taxi");
        } else {
            System.out.println("Classic Taxi");
        }

    }
}

// output

class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
    }
}

// output

class Problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    }
}

// output

class Problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    }
}

// output
 