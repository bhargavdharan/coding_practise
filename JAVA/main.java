// class Test {

//     public static void main(String[] args) {
//         double a = 25.64;
//         int b = 25;
//         a = a % 10;
//         b = b % 10;
//         System.out.println(a+ " " +b);
//     }
// }

// class Test1 {
//     public static void main(String[] args) {
//         int x = 10;
//         int y = x++ + ++x;
//         System.out.println(x+" , "+y);
//     }
// }

// class Test3 {
//     public static void main(String[] args) {
//         String a = new String("ALPHA");
//         String b = "ALPHA";
//         System.out.println(a.equals(b));
//     }
// }

// class Test4 {
//     public static void main(String[] args) {
//         int a = 15;
//         switch (a) {
//             case 15:
//                 System.out.println("Fifteen");
//                 break;
//             // case 10 + 5:
//             //     System.out.println("Ten plus five");
//             //     break;
//         }
//     }
// }

import java.util.*;

class test4 {
    public static void main(String[] args) {
        PriorityQueue p1 = new PriorityQueue();
        p1.add(41.2);
        p1.add(26.5);
        p1.add(31.3);
        p1.peek();
        p1.poll();
        p1.remove(26.5);
        boolean b = p1.contains("41.2");
        System.out.println(b);
        Object[] arr = p1.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString() +" ");
        }
    }
}
