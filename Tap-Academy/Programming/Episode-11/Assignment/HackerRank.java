import java.util.*;

class HackerCode1 {
    public static String CatAndMouse(int x, int y, int z) {
        int a = Math.abs(x - z);
        int b = Math.abs(y - z);
        if (a < b) {
            return "Cat A";
        } else if (a > b) {
            return "Cat B";
        }
        return "Mouse C";
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        System.out.println(CatAndMouse(x, y, z));
    }
}